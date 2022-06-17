def getUniqueCharacter(s):
    x=len(s)
    for i in range(0,x):
        flag=0
        for j in range(i+1,x):
            if(s[i]==s[j]):
                flag=1
                break
        if(flag==0):
            return i+1
    return -1
    
##    l=[]
##    for i in range(0,len(s)-1):
##        for j in range(i+1,len(s)):
##            if(s[i]==s[j] and s[j]not in l):
##                l.append(s[j])
##    y=[]
##    for i in s:
##        y.append(i)
##
##
##    z=[]
##    for i in y:
##        if(i not in l):
##            z.append(i)
##    if(len(z)==0):
##        return -1
##    else:
##        a=z[0]
##        c=0
##        for i in s:
##            c=c+1
##            if(a==i):
##                break
##        return c       


x=input()
print(getUniqueCharacter(x))
##l=[]
##for i in range(0,len(x)-1):
##    for j in range(i+1,len(x)):
##        if(x[i]==x[j] and x[j]not in l):
##            l.append(x[j])
##y=[]
##for i in x:
##    y.append(i)
##
##
##z=[]
##for i in y:
##    if(i not in l):
##        z.append(i)
##if(len(z)==0):
##    print(-1)
##else:
##    a=z[0]
##    c=0
##    for i in x:
##        c=c+1
##        if(a==i):
##            break
##    print(c)          
