for i in range(100, 1000):
    a = int(i / 100)
    b = int(i / 10 % 10)
    c = int(i % 10)
    s = a * a * a + b * b * b + c * c * c
    if s == i:
        print(i, "是水仙花数")
input("按任意键退出...")
