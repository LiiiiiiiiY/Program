socre = int(input()) # 创建一个整型变量，将输入值通过强制转换赋给变量用于比较值
if socre >100 : # 如果输入的值超过一百分，做一个提示
    print("满分100！")
elif socre >=90: # 如果输入的值在90-100区间，得出A的成绩
    print("A")
elif socre >=80: # 如果输入的值在80-89区间，得出B的成绩
    print("B")
elif socre >=60: # 如果输入的值在60-79区间，得出C的成绩
    print("C")
else:            # 如果输入的值在60以下，得出D的成绩
    print("D")
