class SqStack:
  def __init__(self):         # 构造方法
    self.data=[]              # 存放栈中元素，初始为空

  def empty(self):            # 判断栈是否为空
    if len(self.data) == 0:
      return True
    return False

  def push(self, e):          # 元素e进栈
    self.data.append(e)

  def pop(self):              # 元素出栈
    assert not self.empty()   # 检测栈为空
    return self.data.pop()

  def gettop(self):           # 取栈顶元素
    assert not self.empty()   # 检测栈为空
    return self.data[-1]

if __name__ == '__main__':    # 定义顺序栈的对象
    st = SqStack()
    st.push('A')
    st.push('B')
    st.push('C')
    st.push('D')
    st.push('E')
    print(st.pop())
    print(st.pop())
    print(st.pop())
    print(st.pop())
    print(st.pop())