def Count(m,n):
    if m<n:
        return 0
    if n==0:
        return 1
    res=(Count(m-1,n)+
         Count1(m//2,n-1))
    return res
if __name__=='__main__':
    m=int(input())
    n=int(input())
    
    print(Count(m,n))
     
