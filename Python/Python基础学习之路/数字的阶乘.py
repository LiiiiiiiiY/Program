# 开发时间：2023/4/18 18:34
def get_jiecheng(Sum):
    value = 1
    while Sum > 0:
        value *= Sum
        Sum -= 1
    return value


print("5的阶乘为", get_jiecheng(5))
