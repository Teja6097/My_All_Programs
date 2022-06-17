def solution(l):
    n=len(l)
    count_0=0
    count_1=0
    for i in l:
        if(i==0):
            count_0+=1
        else:
            count_1+=1
    count=0
    while(count_1!=count_0):
        if(count_1>count_0):
            count_1-=1
            count_0+=1
            count+=1
        else:
            count_0-=1
            count_1+=1
            count+=1
            

    print(count)

l=list(map(int,input().split()))
solution(l)
