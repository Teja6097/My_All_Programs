def countMinOperations(arr, n):          
       arr.sort()
       count=0                           
       while(arr.count(0)!=n):
           for i in range(n):
               if(arr[i]%2==1):
                   arr[i]=arr[i]-1              
                   count=count+1
           for i in range(n):
               arr[i]=arr[i]//2                         
           count=count+1
       print( count-1)
arr=list(map(int,input().split()))
n=len(arr)
countMinOperations(arr,n)
