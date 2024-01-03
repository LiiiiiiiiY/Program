def cmax(old_num):
    while len(old_num) != len(set(old_num)):
        num = set(old_num)
        # old_num = [j for j in old_num if j not in num or num.remove(j)]
        for i in num:
            for j in old_num:
                if i == j:
                    old_num.remove(j)
                    break
        num.intersection_update(old_num)
    return old_num


num1 = [1, 2, 3, 1, 4, 2, 1, 3, 7, 3, 3]
num2 = [1, 2, 2, 1, 3]
print(cmax(num1))
print(cmax(num2))
