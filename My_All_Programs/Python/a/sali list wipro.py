def solution(x):
    y=list(x)
    z=[]
    flag=0
    for i in range(0,len(y)):
        for j in range(i+1,len(y)):
            if((y[i]==y[j].lower() or y[i]==y[j].upper())and y[i]!=y[j] ):
                a=y[i].upper()
                z.append(a)
                flag=1
    
    if(flag==1):
        print(max(z))
    else:
        print("NO")
                           
s=input()
solution(s)
