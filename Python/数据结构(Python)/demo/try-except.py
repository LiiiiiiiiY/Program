print("下面开始判断一个数字的奇偶性")
while True:
    try:
        num = int(input("请输入一个数字："))
        break
    except:
        print("输入无效，请重新输入！")

if num % 2 == 0:
    print(f"{num}是偶数")
else:
    print(f"{num}是奇数")