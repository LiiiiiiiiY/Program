
### 问题描述
创建汽车类Car，使用Collections工具类和Comparator接口实现carList按price从高到低输出。定义一个测试主类Test。要求：
1. 定义一个汽车类Car，包含2个属性brand（品牌，String）, price（价格，int），相关构造方法、getter和setter根据实际需要设置。
2. 定义一个测试主类Test，建立一个ArrayList类型的carList（放入3个Car对象），使用Collections工具类和Comparator接口实现carList按price从高到低输出。
### 输入形式
```java
List<Car> carList = new ArrayList<>();
carList.add(new Car("changan", 120000));
carList.add(new Car("byd", 230000));
carList.add(new Car("geely", 140000));
```
### 输出形式
```java
Car [brand=byd, price=230000]
Car [brand=geely, price=140000]
Car [brand=changan, price=120000]
```