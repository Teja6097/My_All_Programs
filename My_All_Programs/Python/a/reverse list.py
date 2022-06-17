##l=list(map(int,input().split()))
##l.reverse()
##for i in l:
##    print(i,end=" ")


##l=list(map(int,input().split()))
##x=[]
##for i in range(0,len(l)-1):
##    if(l[i]==l[i+1]-1):
##       if(l[i] not in x):
##           x.append(l[i])
##    if(l[i+1]==l[i]+1):
##       if(l[i+1] not in x):
##           x.append(l[i+1])
##print(x)


##l=list(map(int,input().split()))
##Children=0
##Adult=0
##for i in l:
##    if(i<18):
##        Children+=1
##    else:
##        Adult+=1
##print("Children count: ",Children)
##print("Adult count: ",Adult)

##
##s=input()
##x=s.split(" ")
##n=len(x)
##for i in range(0,len(x)):
##    print(x[i][-1],end="")

##l=list(map(int,input().split()))
##for i in range(0,len(l)-1):
##    for j in range(i+1,len(l)):
##        temp=l[i]
##        l[i]=l[j]
##        l[j]=temp
##print(l)
