String = input("请输入字符串：")
strLen = len(String)
middle = int(strLen / 2)
if strLen <= 2:
    print("输入的字符串太少了！")
elif strLen % 2 == 0:
    print("中间的字符有两个，分别是", String[middle - 1], "和", String[middle])
else:
    print("中间的字符只有一个，是", String[middle])
input("按任意键退出...")

