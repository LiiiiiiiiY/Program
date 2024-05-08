# NoSQL复习

## 一、绪论

### 1、**基本概念**：

- 数据库：存储数据的管理软件
- 数据仓库：对数据进行分析处理
- 数据模型：将事物转化为数据的规则

### 2、**数据库的三种逻辑结构**

- 主要分为层次型、网状型、**关系型**

> 关系型数据库的**优点**：容易理解、使用方便、易于维护
>
> 关系型数据库的**缺点**：高并发读写能力差、对海量数据的读写效率低、扩展性差、无法适应多变的数据结构

### 3、NoSQL

**特点：**灵活的数据模型、可伸缩性强、自动分片、自动复制

**类别：**非关系型数据库

**分类：**键值数据库、列族数据库、文档数据库、图形数据库

## 二、HBase

### 1、HBase的特性

- 容量巨大（海量存储）、列式存储、稀疏性、扩展性强、高可靠性，高并发。

### 2、HBase的组件和功能

- **隶属于Hadoop**生态圈，**依附于ZooKeeper**集群，由**`HMaster`**节点和**`HRegionServer`**节点组成。
- Hadoop的HDFS提供了高可靠的底层存储支持，Hadoop的MapReduce为HBase提供了高性能的计算能力，Zookeeper为HBase提供了稳定性和集群管理功能，总体结构如下：

![img](https://raw.githubusercontent.com/LiiiiiiiiY/Typora/master/img/20200903145325963.png)

用户写入数据时，数据首先被写入到`MemStore`和`Hlog`中，系统会周期性地把`MemStore`缓存里的内容刷写到磁盘的`StoreFile`文件中，每次刷写都生成一个新的`StoreFile`文件。

## HBase数据模型与使用

### 1、基本概念

**结构：**表(Table)、行(Row)、列族(Column Family)、列标识(Column Qualifier)、单元格(Cell)、时间戳(Timestamp)

**来源：** Big Table

### 2、HBase Shell操作

- **创建表**
  **`create 'student', 'stuInfo', 'Grades'`** ：创建一个student表，里面有`stuInfo`和`Grader`两个列族
  **`create 'student', {NAME => 'stuInfo', VERSIONS => 3}, {NAME => 'Grades', BLOCKCACHE => true}`**
  `versions => 3` 表示单元格内的数据可以保留最近3个版本的，`BLOCKCACHE => true` 表示允许读取数据时缓存
- **更改数据**
  **`alter 'student', {NAME => 'Grader', VERSIONS => 3}`** ：将`student`表中的Grader列族更新为保存最近3个版本
  **`alter 'student', 'hobby'`**  ：新增加一个列族hobby
  **`alter ‘student', {NAME => 'hobby', METHOD => 'delete'}`** ：这两个都是删除已有列族
  **`alter 'student', 'delete' => 'hobby'`**
- **删除表**
  **`disable 'student'`** ：先停用表，再删除。可以使用`is_disable`查看启停状态
  **`drop 'student'`**
  **`truncate 'student'`** ：清空表数据
- **插入一行数据**
  **`put 'student', '001', 'stuInfo:Name', 'Tom Green', 1`** ：分别对应表、行键、列族:列、插入数据、[时间戳]
- **删除数据**
  **`delete 'student', '002', 'Grader:Math', 1`** ：分别对应表、行键、列族[:列名、时间戳]
  注：① 不会立马删除，只是打上删除标记，等待数据合并是才会删除。② 最小的单位是单元格。③ 不能跨列操作
- **获取数据**
  **`get 'student', '001', 'stuInfo:Name' 'jerry', 4`** ：分别对应表、行键[、列族:列名、数据值、时间戳]
- **全表扫描**
  **`scan 'student'`**
  **`scan 'student', {COLUNM => 'stuInfo:Name'}`** ：指定列族和列进行扫描
  **`scan 'student', {LIMIT => 1}`** ：指定输出行
  **`scan 'student', {STARTROW => '001', ENDROW => '003'}`** ：指定输出行键范围

### 3、过滤器操作

- **基本语法： `scan '表名', {FILTER => "过滤器(比较运算符, '比较器')"}`**

| 比较运算符 | 描述     |      | 比较器                   | 描述             |
| ---------- | -------- | ---- | ------------------------ | ---------------- |
| =          | 等于     |      | `BinaryComparator`       | 匹配完整字节数组 |
| >          | 大于     |      | `BinaryPrefixComparator` | 匹配字节数组前缀 |
| >=         | 大于等于 |      | `BitComparator`          | 匹配比特位       |
| <          | 小于     |      | `NullComParator`         | 匹配空值         |
| <=         | 小于等于 |      | `RegexStringComparator`  | 匹配正则表达式   |
| !=         | 不等于   |      | `SubstringComparator`    | 匹配子字符串     |

#### 行键过滤器

- 匹配行键中大于001的数据：**`scan 'student', FILTER => "RowFilter( >, 'binary:001')"`**
- 匹配行键以001开头的数据：**`scan 'student', FILTER => "RowFilter( =, 'substring:001')"`** 
- 行键前缀比较器，同上句话：**`scan 'student', FILTER => 'PrefixFilter(001)'`**
- 只对过滤和显示单元格的键：**`scan 'student', FILTER => "KeyOnlyFilter()"`**
- 只显示相同键的第一个单元格：**`scan ’student', FILTER => "FirstKeyOnlyFilter()"`**
- 替代ENDROW返回终止条件行：**`scan 'student', { STARTROW => '001', FILTER => "InclusiveStopFilter('binary:002')"}`**

#### 列族与列过滤器

- 列标识过滤器：**`scan 'student', FILTER => "QualifierFilter( =, substring:Math)"`**
- 列名前缀过滤器：**`scan 'student', FILTER => "ColumnPrefixfilter('Ma')"`**
- 多个列明前缀过滤器：**`scan 'student', FILTER => "MultipleColumnPrefixfilter('Ma','Ag')"`**
- 过滤列名称的范围**`scan 'student', FILTER => "columnRangFilter('Big', true,'Math', false)"`**，true和false可以指明是否包含起始或终止列

#### 值过滤器

- 找到符合值条件的键值对**`scan 'student', FILTER => "Valuefilter( =, 'substring:curry')"`** 
- 这句话的含义同上：**`get 'student', '001', FILTER => "ValueFilter( =, 'substring:curry')"`**
- 指定列族和列进行比较的值过滤器：**`scan 'student', FILTER => "singleColumnValueFilter('stuInfo', 'Name', = 'substring:curry')"`**
- 排除匹配成功的值**`scan 'student', FILTER => "ExcludeFilter('stuInfo', 'Name', = , 'substring:curry')"`**

#### 其他过滤器

- 时间戳过滤：**`scan 'student', FILTER => 'TimestampsFilter(1,4)'`**
- 