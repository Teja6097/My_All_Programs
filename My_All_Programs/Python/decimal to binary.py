t=int(input("Enter number of test Cases: "))
for i in range(0,t):
    n=int(input("Enter the number: "))
    temp=n
    s=0
    l=[]
    
    while(temp!=0):
        rem=temp%2
        s=s*10+rem
        l.append(rem)
        temp//=2
        
    print(l[::-1])
    print(s)
