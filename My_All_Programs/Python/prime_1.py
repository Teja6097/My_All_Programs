##n=int(input()) #9 2 to 20  19
##flag=0
##for i in range(2,n//2): #(2,9) 4 to 8 
##    if(n%i==0): #4%2==0 9%2==1 9%3==0
##        flag=1
##        break
##if(flag==0 or n==2):
##    print("True")
##else:
##    print("False")
##for i in range(10,1,-1):
##    print(i)
##2 to 20 19

##1000 to 9999

##flag=0
for i in range(9999,999,-1): #9998 
    flag=0
    for j in range(2,i//2):
        if(i%j==0):
            flag=1
            break
    if(flag==0):
        print(i)
        break
        
