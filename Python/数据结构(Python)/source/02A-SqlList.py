import time
class SqlList:
    def __init__(self):
        self.initcapacity = 5
        self.capacity = self.initcapacity
        self.data = [None] * self.capacity
        self.size = 0
    
    def resize(self,newcapacity):
        assert newcapacity >= 0
        olddata = self.data
        self.data = newcapacity * [None]
        self.capacity = newcapacity
        for i in range(self.size):
            self.data[i] = olddata[i]
  
    def createList(self,a):
        for i in range(len(a)):
            if self.size == self.capacity:
                self.resize(2 * self.capacity)
            self.data[self.size] = a[i]
            self.size += 1
            
    def append(self,a):
        if self.size == self.capacity:
            self.resize(2 * self.capacity)
        self.data[self.size] = a
        self.size += 1
  
    def display(self):
        for i in range(self.size):
            print(self.data[i],end=" ")
        print()
            
    def legnth(self):
        print(f"长度为{self.size}")
        
    def getIndex(self,i):
        assert 0 <= i <= self.size
        print(f"第{i}个元素为{self.data[i]}")
    
    def setIndex(self,i,x):
        assert 0 <= i <= self.size
        self.data[i] = x
            
    def getElement(self,x):
        for i in range(self.size):
            if self.data[i] == x:
                return print(f"元素{x}在索引{i}")
        print("没有找到元素")
        
    def Insert(self,i,x):
        assert 0 <= i <= self.size
        if self.size == self.capacity:
            self.resize(2 * self.capacity)
        for j in range(self.size,i-1,-1):
            self.data[j+1] = self.data[j]
        self.data[i] = x
        self.size += 1
    
    def delete(self,i):
        assert 0 <= i < self.size
        for j in range(i+1,self.size):
            self.data[j-1] = self.data[j]
        self.size -= 1
    
    def delFromTo(self,i,k):
        assert i >= 0 and k >= 1 and 1<= i+k <= self.size
        for j in range(i+k,self.size):
            self.data[j-k] = self.data[j]
        self.size -= k

    def delSomeone(self,x):
        index = 0
        for i in range(self.size):
            if self.data[i] == x:
                index += 1
            else:
                self.data[i-index] = self.data[i]
        self.size -= index
        
    def mergeSort(self,B):
        C = SqlList()
        i = j = 0
        while i<self.size and j<B.size:
            if self.data[i] <= B.data[j]:
                C.append(self.data[i])
                i += 1
            else:
                C.append(B.data[j])
                j += 1
        while i<self.size:
            C.append(self.data[i])
            i += 1
        while j<B.size:
            C.append(B.data[j])
            j += 1
        C.display()


startTime = time.time()
A = SqlList()
A.createList([1,7,16,44,55,60,79,80,89,93])
A.display()
B = SqlList()
B.createList([9,11,36,61,63,66,86,89,90,94])
B.display()
A.mergeSort(B)
endTime = time.time()
print(f"本次用时：{endTime-startTime}")