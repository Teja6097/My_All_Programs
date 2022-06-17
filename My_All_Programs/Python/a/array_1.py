##n=int(input())
##x=[]# 4
##for i in range(0,n):# 3 0 1 2
##    s=int(input()) #4
##    x.append(s)     #4 
##print(x)


##x=int(input()) 4
##y=int(input())5
##print(x,y)
##x,y=map(int,input().split()) 4 5
##print(x,y)




##l=list(map(int,input().split())) # 1 2 3 
####print(sum(l))
##s=1
##
##for i in l:
##    s=s*i
##    print(s)

##l=list(map(int,input().split()))  # 23 45 2
##
####m=l[0] #23
####for i in l:
####    if(i>m): # 23>23 45>23 2>45
####        m=i #m=45
##print(min(l))

##l=list(map(int,input().split()))
##n=int(input())#8
##n=n%len(l)
##x=l[0:n]
##y=l[n:]
##for i in x:
##    y.append(i)
##print(y)



n=int(input())

if(n%400==0):
    print("Leap Year")
elif(n%4==0):
    print("Leap Year")
else:
    print("Not a leap year")
































