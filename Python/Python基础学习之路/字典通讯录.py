print("|---欢迎进入通讯录程序---|\n"
      "|---1：查询联系人资料---|\n"
      "|---2：插入新的联系人---|\n"
      "|---3：删除已有联系人---|\n"
      "|---4：退出通讯录程序---|\n")
address_list = {}
while True:
    code = int(input("请输入相关的指令代码: "))
    if code == 1:
        name = input("请输入联系人姓名：")
        if name in address_list:
            print(f"{name}:{address_list[name]}")
        else:
            print("查无此人")
        print()
    elif code == 2:
        name = input("请输入联系人姓名：")
        if name not in address_list:
            address_list[name] = input("请输入用户联系电话：")
            print(f"插入新的联系人{name}成功！")
        else:
            print(f"您输入的姓名在通讯录中已存在 -->{name}:{address_list[name]}")
            if input("是否修改用户资料（YES/NO）：").upper() == "YES":
                address_list[name] = input("请输入用户联系电话：")
                print(f"修改联系人{name}成功！")
        print()
    elif code == 3:
        name = input("请输入联系人姓名：")
        if input("是否修改用户资料（YES/NO）：").upper() == "YES":
            address_list.pop(name, "查无此人")
        else:
            break
        print()
    elif code == 4:
        print("欢迎您的下次使用！")
        break