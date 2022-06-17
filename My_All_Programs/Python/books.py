a,b=map(int,input().split())
l=list(map(int,input().split()))
tot=0
for i in range(0,b):
    if(i==0 or l[i]%10==0):
        tot=tot+l[i]
    else:
        tot=tot*(l[i]%10)
print(tot%1000000007)
