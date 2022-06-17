##a=int(input())
##b=int(input())
##if(a>b):
##    print(a," is greater ",b)
##else:
##    print(b," is greater ",a)


##
def max_1(x,y): 
    if(x>y):
        return 1
    else:
        return 0




a,b=map(int,input().split()) 
c=max_1(a,b)
if(c==1):
    print(a)
else:
    print(b)
