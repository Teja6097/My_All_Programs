s=input()
slist=s.split()
l=[]
for i in slist:
    len1=len(i)
    if(len1%2==0 and (i[-1] !=',' and i[-1]!='.')):
        if i not in l:
            l.append(i)
for j in l:
    print(j)
