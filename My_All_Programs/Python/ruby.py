def count_numbers(k, n):
    dp = [[0 for i in range(2)]
             for i in range(n + 1)]
    dp[1][0] = 0
    dp[1][1] = k - 1
    for i in range(2, n + 1):
        dp[i][0] = dp[i - 1][1]
        dp[i][1] = (dp[i - 1][0] +
                    dp[i - 1][1]) * (k - 1)
    return dp[n][0] + dp[n][1]
n,k=map(int,input().split())
print(count_numbers(k, n))
 
