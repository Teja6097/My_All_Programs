class Node:
    def __init__(self,data):
        self.data=data
        self.next=None

class Linkedlist:
    def __init__(self):
        self.head=None

    def printList(self):
        temp=self.head
        while(temp):
            print(temp.data,end=" ")
            temp=temp.next

    def push(self,new_data):
        new_node=Node(new_data)
        new_node=self.head
        self.head=new_node

if __name__=='__main__':
    llist=Linkedlist()
    llist.head=Node(1)
    t2=Node(2)
    t3=Node(3)
    llist.head.next=t2
    t2.next=t3
    t5=10
    llist.push(t5)
    llist.printList()


