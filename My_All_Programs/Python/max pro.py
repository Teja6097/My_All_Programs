t=int(input())
while(t>0):
    n=int(input())
    count=0
    s=0
    for i in range(1,n):
        s=s+i
        count=count+1
        if(s>(n//2)+1):
            ind=i
            break
    for i in range(1,ind):
        
