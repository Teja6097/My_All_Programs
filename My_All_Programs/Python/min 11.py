def minimum(l):
    x=l[0]
    for i in l:
        if(i<x and i%11==0):
            x=i
    print(x)




l=list(map(int,input().split()))
len1=len(l)
res=minimum(l)





##def solution(n):
##    for i in range(1,n+1):
##        if(i==n):
##            for j in range(1,n+1):
##                print("L",end="")
##        else:
##            print("L")
##
##n=int(input())
##res=solution(n)
