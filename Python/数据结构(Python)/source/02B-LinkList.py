class LNode:
    def __init__(self,data = None):
        self.data = data
        self.next = None

class LinkList:
    def __init__(self):
        self.head = LNode()
        self.head.next = None
        
    def CreateListHeadInsert(self,a):
        for i in range(len(a)):
            s = LNode(a[i])
            s.next = self.head.next
            self.head.next = s
    
    def CreateListTailInsert(self,a):
        p = self.head                           # 将头节点赋值给 变量 t，作为当前节点的引用
        for i in range(len(a)):                 # 遍历待插入列表a中的每一个元素
            s = LNode(a[i])                     # 创建新节点s，并赋值为a[i]即s.data = a[i]
            p.next = s                          # 将当前节点p的下一个节点指针指向新创建的节点s，实现了将新节点插入到链表的尾部
            p = s                               # 将当前节点p移动到新插入的节点s，准备进行下一次插入操作
        p.next = None                           # 最后一个节点的下一个节点指针置为None，表示链表的尾部

    def display(self):
        p = self.head
        while p.next != None:
            print(p.next.data,end = ' ')
            p = p.next
        print()
        
    def getLength(self):
        p = self.head
        length = 0
        while p.next != None:
            length += 1
            p = p.next
        return length

    def getNode(self,index):
        p = self.head
        count = -1
        while p != None and count < index:
            count += 1
            p = p.next
        return p
    
    def append(self,data):
        s = LNode(data)
        p = self.head
        while p.next != None:
            p = p.next
        p.next = s
        
    def getElement(self,index):
        assert 0 <= index < self.getLength()
        p = self.getNode(index)
        assert p != None
        return p.data
    
    def setElement(self,index,data):
        assert 0 <= index < self.getLength()
        p = self.getNode(index)
        assert p != None
        p.data = data
        
    def getIndex(self,data):
        p = self.head                       # 设置当前节点指针p
        count = 0                           # 设置计数器，从0开始
        while p != None:               # 遍历链表，如果发现当前结点的指针域为空，则表示遍历完成
            if p.data != data:              # 如果当前结点的data与待查data不同
                p = p.next                  # 将当前结点p移动到下一个节点
                count += 1                  # 并将计数器加一
            else:
                return count                # 如果当前结点的data与待查data相同，则返回当前结点的结点号
        return None                         # 遍历完成后没有找到相同的data，则返回None
        
        
    def insert(self,index,data):
        assert 0 <= index <= self.getLength()
        s = LNode(data)
        p = self.getNode(index-1)
        assert p != None
        s.next = p.next
        p.next = s
        
    def delete(self,index):
        assert 0 <= index < self.getLength()
        p = self.getNode(index-1)
        assert p != None and p.next != None
        p.next = p.next.next
    

a = LinkList()
a.CreateListTailInsert([3,5,7,1,9])
print(a.getIndex(9))
# a.display()