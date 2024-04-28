class SqlStack:
    def __init__(self):
        self.data = []
    
    def empty(self):
        if len(self.data) == 0:
            return True
        return False
    
    def push(self,data):
        self.data.append(data)
        
    def pop(self):
        assert not self.enpty()
        self.data.pop()
    
    def top(self):
        assert not self.empty()
        return self.data[-1]