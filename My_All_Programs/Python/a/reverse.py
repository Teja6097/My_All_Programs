n=int(input())

for i in range(0,n):
    ch='a'
    
    for j in range(0,i+1):
        print(ch,end="")
        x=ord(ch[0])
        y=x+1
        ch=chr(y)
    print()




##  4  
## a
## ab
## abc
## abcd
## *****
 
