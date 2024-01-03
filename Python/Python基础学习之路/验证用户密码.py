USER = "root"
PASSWD = "admin"
for i in range(3):
    IPUser = input("请输入用户名：").replace("*", "")
    IPPasswd = input("请输入密码：").replace("*", "")
    if USER == IPUser and PASSWD == IPPasswd:
        print("登陆成功")
        break
    else:
        print("用户名或密码输入错误，您还有", 2-i, "次机会")
input("按任意键退出...")
