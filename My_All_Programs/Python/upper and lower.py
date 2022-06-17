x=input()
a=0
b=0
for i in range(0,len(x)):
    if(x[i]>='a' and x[i]<='z'):
        a+=1
    if(x[i]>='A' and x[i]<='Z'):
        b+=1
print(a)

