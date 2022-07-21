class Solution {
    
   public int fib(int n)
    {
       int[] dp = new int[n+1];
        if(n ==0 || n == 1)
            return n;
        else if(dp[n] != 0)
            return dp[n];
		else 
            return dp[n] = fib(n - 1) + fib(n - 2);
    }
}