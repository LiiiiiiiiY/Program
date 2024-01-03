dict = {"k1": "v1", "k2": "v2", "k3": "v3"}

print("1、循环遍历出所有的key:")
for keys in dict.keys():
    print(keys, end=" ")

print("\n\n2、循环遍历出所有的value")
for values in dict.values():
    print(values, end=" ")

print("\n\n3、循环遍历出所有的key和value")
for keys,values in dict.items():
    print(keys,values, end=", ")

print("\n\n4、在字典中增加一个键值对 k4: v4，输出添加后的字典：")
dict["k4"] = "v4"
print(dict)

print("\n5、删除字典中键值对 k1: v1，并输出删除后的结果：")
del dict["k1"]
print(dict)

print("\n6、删除字典中键k5对应的键值对，如果字典中不存在键k5，则不报错，返回None")
dict.pop("k5", None)
print(dict)

print("\n7、获取字典中k2对应的值")
value = dict.get("k2")
print(value)

print("\n8、获取字典中k6对应的值，如果不存在，则不报错，并且让其返回None")
value_k6 = dict.get("k2","hhh")
print(value_k6)

print('\n9、通过一行操作使dict2 = {"k1": "v1", "k2": "v2", "k3": "v3", "a": "b"}')
dict2 = {"k1": "v1", "a": "b"}
dict2 = {"k1": "v1", "k2": "v2", "k3": "v3", "a": "b"}
print(dict2)
