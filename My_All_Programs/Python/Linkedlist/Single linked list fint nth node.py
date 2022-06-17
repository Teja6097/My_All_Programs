class Node:
    def __init__(self,data):
        self.data=data
        self.next=None

class Linkedlist:
    def __init__(self):
        self.head=None

    def push(self,new_data):
        new_node = Node(new_data)
        new_node.next= self.head
        self.head=new_node

    def count(self):
        c=0
        temp=self.head
        while(temp):
            c=c+1
            temp=temp.next
        return c

    def delete(self,key):
        
        #if data to be deleted by the 1st node
        temp=self.head
        if (temp is not None):
            if(temp.data==key):
                self.head=temp.next
                temp=None
                return

        while(temp):
            if(temp.data==key):
                break
            prev=temp
            temp=temp.next

        if(temp==None):
            return

        prev.next=temp.next
        temp=None
        return


    def search(self,key):
        flag=0
        temp=self.head
        while(temp):
            if(temp.data==key):
                flag=1
            temp=temp.next
        if(flag==1):
            print("true")
        else:
            print("false")
                
        

    def printlist(self):
        temp=self.head
        while(temp):
            print(temp.data, end = " ")
            temp=temp.next
        print()

    def append(self,new_data):
        new_node=Node(new_data)

        if(self.head is None):
            self.head=new_node
            return   
        temp=self.head
        while(temp.next):
            temp=temp.next
        temp.next=new_node
        return

    def index(self,key):
        temp=self.head
        ind=0
        while(temp):
            if(temp.data==key):
                break
            ind=ind+1
            temp=temp.next
        print(ind)

    def insertAt(self,key,new_data):
        new_node=Node(new_data)
        if(key > llist.count()):
            print("Out of Range")
            return

        if(key==0):
            new_node.next=self.head5
            self.head=new_node
            return
        else:
            ind=0
            temp=self.head
            while(temp):
                if(ind==key):
                    break
                prev=temp
                    
                temp=temp.next
                ind=ind+1
            prev.next=new_node
            new_node.next=temp
            return
    
          

if __name__=="__main__":
    llist=Linkedlist()
    llist.push(1)
    llist.push(2)
    llist.push(3)
    llist.push(4)
    llist.push(5)
    llist.push(6)
    print("main list")
    llist.printlist()
    print("main list count")
    print(llist.count())
    llist.delete(4)
    print("after deletion")
    llist.printlist()
    llist.append("10")
    print("after insertion")
    llist.printlist()
    x=llist.search(15)
    y=llist.search(5)
    print("index present for key")
    llist.index(1)
    print("Insert a element at perticular index")
    llist.insertAt(3,100)
    print("Updated list")
    llist.printlist()
    
    
    
    
    
        
