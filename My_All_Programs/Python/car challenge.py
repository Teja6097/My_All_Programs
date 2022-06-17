import random
x=50
l=[]
for i in range(0,6):
    x=random.randint(1,100)
    l.append(x)
l.sort()
count=1
pos=0
##for i in l:
print(l)
##y=random.randint(0,6)
##print(y)
for p in range(0,6):
##while(x!=0):
    y=random.randint(0,6)
    x=x-(y*2)
    pos=pos+y
    print(y)
##    for k in l:
##        if(pos==k):
##            x=x+30
##    print("Move ",count," - car at ", pos, ", petrol remaining ",x)
##    count+=1
##    
    
