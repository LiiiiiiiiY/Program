x = 1  # 定义一个变量x，将他的初始值定为1
y = 2  # 定义一个变量y，将他的初始值定为2
z = 3  # 定义一个变量z，将他的初始值定为3
print("交换前的x的值为", x, "，y的值为", y, "，z的值为", z)  # 打印交换前的x、y、z的值
y, z, x = x, y, z  # 将x、y、z的值分别赋值给y、z、x
print("交换后的x的值为", x, "，y的值为", y, "，z的值为", z)  # 打印交换后的x、y、z的值
