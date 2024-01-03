# 开发时间：2023/4/27 17:13
import PySimpleGUI as UI
# import：导入其他python文件（称为模块module），使用该模块里定义的类、方法或者变量，从而达到代码复用的目的

# 定义一个列表，列表中存放的元素是窗口显示的内容
layout = [
    [UI.Text("请输入您的信息")],
    [UI.Text("姓名",enable_events=True), UI.InputText("张三")],
    [UI.Text("性别"), UI.InputText()],
    [UI.Text("民族"), UI.InputText()],
    [UI.Button("确认1"), UI.Button("取消1")],
    [UI.Button("确认2"), UI.Button("取消2")],
    [UI.Button("确认3"), UI.Button("取消3")],
]

# 定义一个变量，存放PySimpleGUI文件中window方法的返回值
# 方法window：其中的"Python GUI"表示窗口显示的文字标题
#            其中的layout是将这个参数的值显示出来
window = UI.Window("Python GUI", layout)

# 循环始终为真，即死循环
while True:
    event, value = window.read()
    if event == None:
        break
    if event == "确认1":
        UI.Popup("执行了确认1任务")
    if event == "取消1":
        UI.Popup("执行了取消1任务")
    if event in ("确认2", "取消2"):
        UI.Popup("您点击了确认2或者取消2")
    if event.startswith("确认3"):
        UI.Popup("您点击了确认3")
    if event.startswith("取消3"):
        UI.Popup("您点击了取消3")
    if event == "姓名":
        UI.Popup("这是单纯的文本，不过你发现了彩蛋")
window.Close()
