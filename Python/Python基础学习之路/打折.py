money = float(input("请输入图书价格："))
if money <= 0:
    print("施主，本店不谈缘，谈元")
elif money < 128.0:
    money *= 0.92
    print("这本书打92折后", money, "元")
else:
    money *= 0.85
    print("这本书打85折后", money, "元")
input("按任意键退出...")
