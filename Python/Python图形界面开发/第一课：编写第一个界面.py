# 导入库，有两种方法
# 方法一：在CMD中输入pip install PySimpleGUI安装库
# 方法二：在代码中输入好下行代码 ↓ ，鼠标悬停在报错的PySimpleGUI上会有提示安装的链接，点击即可
import PySimpleGUI as UI
"""引入PysimpleGUI这个库，并给他定义一个变量名:UI"""
# 定义布局，确定行数
layout = [
    [UI.Text("请输入您的基本信息")],
    [UI.Text("姓名"), UI.InputText("张三")],
    [UI.Text("性别"), UI.InputText("男")],
    [UI.Text("民族"), UI.InputText("汉族")],
    [UI.Button("确认"), UI.Button("取消")],
]
# 创建窗口，第一个参数为"Python GUI"，表示窗口的标签名，第二个参数layout，在这里是一个列表，主要是显示布局内容信息的模块
window = UI.Window("Python GUI", layout)
# 事件循环：让窗口不关闭
while True:
    """window.read是读取这个窗口，并且有两个返回值，第一个返回是值是事件，第二个返回值是值"""
    event, values = window.read()

    if event == None:
        break
# 关闭窗口
window.close()

