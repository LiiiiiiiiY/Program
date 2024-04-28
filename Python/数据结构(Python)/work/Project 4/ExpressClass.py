from SqStack import SqStack
from SqQueue import SqQueue

def infixToPostfix(infixexpr):
    #定义操作符优先级的字典
    prec={}
    prec["*"]=3
    prec["/"]=3
    prec["+"]=2
    prec["-"]=2
    prec["("]=1
    opStack=SqStack()
    postfixQueue =SqQueue()

    for token in infixexpr:             # 遍历中缀字符串
        if token in "ABCDEFGHIJKLMNOPQRSTUVWXYZ" or token in "0123456789":
            postfixQueue.enQueue(token)
        elif token == '(':
            opStack.push(token)
        elif token == ')':
            topToken = opStack.pop()
            while topToken != '(':
                postfixQueue.enQueue(topToken)
                topToken = opStack.pop()
        else:                           # +-*/
            while (not opStack.empty()) and (prec[opStack.gettop()]>=prec[token]):
                postfixQueue.enQueue(opStack.pop())
            opStack.push(token)
    while not opStack.empty():
            postfixQueue.enQueue(opStack.pop())
    
    out = ""
    while not postfixQueue.empty():
        out+=(postfixQueue.deQueue())
    return out
 
if __name__=="__main__":
    print("请输入中缀形式的表达式")
    exp = input()
    print("其后缀表达式为：",infixToPostfix(exp))