class Node:
    def __init__(self,data):
        self.data=data
        self.next=None

class LinkedList:
    def __init__(self):
        self.head=None


    def push(self,new_data):
        new_node=Node(new_data)
        new_node.next=self.head
        self.head=new_node

    def append(self,new_data):
        new_node=Node(new_data)
        if(self.head is None):
            self.head=new_node
            return
        temp=self.head
        while(temp):
            temp=temp.next

        temp.next=new_node
        

    def deleteNode(self,key):
        temp=self.head

        if(temp is not None):
            if(temp.data==key):
                self.head=temp.next
                temp=None
                return
        while(temp is not None):
            if(temp.data==key):
                break
            prev=temp
            temp=temp.next

        if(temp==None):
            return

        prev.next=temp.next
        temp=None

    def printList(self):
        temp = self.head
        while(temp):
            print(temp.data,end=" ")
            temp=temp.next



llist=LinkedList()
llist.push(5)
llist.push(7)
llist.push(4)
llist.append(3)
llist.printList()
