MaxSize=100                     	#全局变量，假设容量为100
class SqQueue:      		        #循环队列类
    def __init__(self):           	#构造方法
        self.data=[None]*MaxSize    	#存放队列中元素
        self.front=0                	#队头指针
        self.rear=0                 	#队尾指针
    def empty(self):                  # 判断队列是否为空
        return self.front == self.rear

    def enQueue(self, e):             # 元素e进队
        assert (self.rear + 1) % MaxSize != self.front  # 检测队满
        self.rear = (self.rear + 1) % MaxSize
        self.data[self.rear] = e

    def deQueue(self):                # 出队元素
        assert not self.empty()         # 检测队空
        self.front = (self.front + 1) % MaxSize
        return self.data[self.front]

    def gethead(self):                # 取队头元素
        assert not self.empty()         # 检测队空
        head = (self.front + 1) % MaxSize  # 求队头元素的位置
        return self.data[head]
        
        

if __name__ == '__main__':
    # 定义顺序栈的对象
    sq = SqQueue()
    sq.enQueue('A')
    sq.enQueue('B')
    sq.enQueue('C')
    sq.enQueue('D')
    sq.enQueue('E')

    print(sq.deQueue())
    print(sq.deQueue())
    print(sq.deQueue())
    print(sq.deQueue())
    print(sq.deQueue())