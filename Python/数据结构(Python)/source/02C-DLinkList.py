class DLNode:
    def __init__(self, data=None):
        self.data = data
        self.prior = None
        self.next = None
        

class DLinkList:
    def __init__(self):
        self.head = DLNode()
        self.head.next = None
        self.head.prior = None

    def createHead(self,data):
        for i in range(len(data)):
            s = DLNode(data[i])
            s.next = self.head.next
            if self.head.next != None:
                self.head.next.prior = s
            self.head.next = s
            s.prior = self.head
    
    def createTail(self,data):
        p = self.head
        for i in range(len(data)):
            s = DLNode(data[i])
            p.next = s
            s.prior = p
            p = s
        p.next = None