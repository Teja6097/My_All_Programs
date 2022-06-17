t=int(input())
while(t!=0):
    n=int(input())
    l=list(map(int,input().split()))
    count=0
    for i in range(0,n-1):
        for j in range(i+1,n):
            if(l[i]&l[j]>=l[i]^l[j]):
                count+=1
    print(count)
    t-=1
