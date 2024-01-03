red = 3
yellow = 3
green = 6
pick = 8
count = 0
for num_red in range(red + 1):
    for num_yellow in range(yellow + 1):
        num_green = pick - num_red - num_yellow
        if num_green <= green:
            count += 1
            print("%2d:红色有%d个,黄色有%d个,绿色有%d个" %(count,num_red,num_yellow,num_green))
input("按任意键退出...")
