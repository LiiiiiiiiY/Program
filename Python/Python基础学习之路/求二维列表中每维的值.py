List = [["China",48,22,30],["USA",36,39,37],["Russia",23,21,28],
         ["British",19,13,15],["Germany",16,10,15],["Australia",14,15,17],
         ["Korea",13,10,8],["Japan",9,6,10]]
num=[]
for i in range(len(List)):
    num.append(sum(List[i][1:]))

print(List[num.index(max(num))])
