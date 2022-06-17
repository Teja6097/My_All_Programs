x=['a','e','i','o','u','A','E','I','O','U']
s=input()
c=0
for i in range(0,len(s)-1):
    if(s[i] in x and s[i+1] not in x):
        c+=1

print(c)
