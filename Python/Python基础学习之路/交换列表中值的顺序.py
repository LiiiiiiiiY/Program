import random
length = random.randrange(2,40,2)
print("列表的长度为：",length)
half_len = int(length/2)
num = [random.randint(1,1000) for i in range(length) ]
print("生成的原列表为：",num)
for i in range(half_len):
    num[i],num[i+half_len]= num[i+half_len],num[i]
print("交换后的列表为：",num)

