n = int(input())
count = 0
k=1
sum=0
j=1
for i in range(k,n+1):  # k=4
    print(k)
    sum=sum+k
     # sum=9
    #if(sum < n):        # 5<9
     #   print(sum)
    if(sum==n):       # 9==9
        count=count+1   # count=1
        j=j+1
        k=j
        
        sum=0
    if(sum>n):               # 10>9
        j=j+1           # j=2
        k=j             # k=2
        sum=0           # sum=0
    
#print(count)
        
