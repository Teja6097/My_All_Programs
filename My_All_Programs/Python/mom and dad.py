s=str(input())
count=0
n=len(s)
for i in range(0,n-2):
    x=s[i]+s[i+1]+s[i+2]
    if(x=='MOM' or x=='DAD'):
        count+=1
print(count)
            
