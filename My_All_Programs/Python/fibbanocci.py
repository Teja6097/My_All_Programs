##n=int(input("Enter a number: "))
##first=0
##second=1
##for i in range(0,n):
##    print(first,end=" ")
##    temp=first
##    first=second
##    second=temp+second


n=int(input("Enter a number: "))
first=0
second=1
l=[]
for i in range(0,n):
    l.append(first)
    temp=first
    first=second
    second=temp+second
if(n in l):
    print("True")
else:
    print("False")
