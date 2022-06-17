t= int(input())
while(t!=0):
    n=int(input())
    l=list(map(int,input().split()))
    x=0
    y=0
    j=0
    k=n-1
    a=0
    b=0
    while(n!=0):
        if(l[j]<l[k]):
            x=x+1
            a=a+l[j]
            j+=1
        elif(l[j]==l[k]):
            if(a<=b):
                x=x+1
                a=a+l[j]
                j+=1
            else:
                y=y+1
                b=b+l[k]
                k-=1   
        else:
            y=y+1
            b=b+l[k]
            k-=1
        n=n-1
    t=t-1
    print(x,y)
    
    
