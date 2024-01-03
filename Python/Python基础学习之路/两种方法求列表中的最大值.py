import random

number1=[]
for i in range(10):
    num = random.randint(10,100)
    number1.append(num)
print("使用random获取随机输入:",number1)
print("使用random获取随机输入:",max(number1))

number2 = [random.randint(10,100) for i in range(10) ]
print("使用列表推导式来创建列表:",number2)
print("使用列表推导式来创建列表:",max(number2))
