##class Node:
##    def __init__(self,data):
##        self.data=data
##        self.next=None
##
##class LinkedList:
##    def __init__(self):
##        self.head=None
##
##    def printList(self):
##        temp=self.head
##        while(temp):
##            print(temp.data)
##            temp=temp.next
##
##
##if __name__=='__main__':
##
##    llist = LinkedList()
##    llist.head=Node(1)
##    
##    second=Node(2)
##    llist.head.next=second
##
##    third=Node(3)
##    second.next=third
##
##    llist.printList()




''' INSERTION'''


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
        if self.head is None:
            self.head=new_node
            return
        last=self.head
        while(last.next):
            last=last.next
        last.next=new_node

    def printList(self):

        temp=self.head
        while(temp):
            print(temp.data)
            temp=temp.next


    def delete(self,key):

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

if __name__=='__main__':

    llist=LinkedList()
    llist.head=Node(1)

    second=Node(2)
    llist.head.next=second

    third=Node(3)
    second.next=third

    llist.push(4)

    llist.append(10)
    llist.printList()




































    
