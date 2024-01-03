### 1、查看当前Linux存在可安装的Java版本

输入`yum -y list java*`，查看当前Linux存在可安装的Java版本

<img src="C:\Users\YYY\AppData\Roaming\Typora\typora-user-images\image-20231013092023484.png" alt="image-20231013092023484" style="zoom: 50%;" />

### 2、选择对应的Java安装包，输入`yum install -y java版本-openjdk-devel*`

比如安装的是java11，就是`yum install -y java-11-openjdk-devel*`（可以将*改成.x86_64），或者安装java1.8，就是`yum install -y java-1.8.0-openjdk-devel*`

<img src="C:\Users\YYY\AppData\Roaming\Typora\typora-user-images\image-20231013092436766.png" alt="image-20231013092436766" style="zoom: 50%;" />

**因为我这里已经安装过了，没安装过的按显示安装流程，安装完成之后就可以正常编译和运行Java了。**

### 3、安装的时候没带`devel`情况

如果你之前运行的指令没带`devel`，即运行的指令时`yum install -y java-版本-openjdk.*`，那就再补一句`yum install java-版本-openjdk-devel`即可