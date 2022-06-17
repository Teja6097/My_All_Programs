n=int(input("Enter the number: "))
tot=1
# 4>>>>>>1*2*3*4
# for(i=1;i<=n;i++) 1 2 3 4<4 1 2 3 4
##for i in range(1,n+1):
##    tot=tot*i
##
##print(tot)
##

##    1 tot=1*1=1
##    2 tot=1*2=2
##    3 tot=2*3=6
##    4 tot=6*4=24
##i+


i=1
while(i<=n):
    tot=tot*i
    i+=1  #i=i+1
print(tot)
