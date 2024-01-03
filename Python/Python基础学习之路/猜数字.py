import random

print("猜数字游戏开始，请输入数字：")
count = 0
number: float = random.randint(0, 10)
print(number)
while count < 3:
    inputNumber = input()
    count += 1
    if count < 3:
        if number == int(inputNumber):
            print("恭喜你，猜对了!游戏结束！")
            count = 3
        elif number > int(inputNumber):
            print("你输入的数字比随机数大，请再猜：")
        elif number < int(inputNumber):
            print("你输入的数字比随机数小，请再猜：")
    else:
        print("你的三次机会用完了！请重新开始游戏！")
