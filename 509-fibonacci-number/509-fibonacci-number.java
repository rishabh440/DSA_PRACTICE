class Solution {
    
   public int fib(int n)
    {   // base cases 
        if(n == 0 || n == 1)
            return n;
        
        // take an auxilary space i.e, an array of size one more than the input size
        int dp[] = new int[n+1];
        
        // initialize the base case values in the dp array
        dp[0] = 0;
        dp[1] = 1;
        
        // now start filling the array so that when the previously computed values are required
        // we can simply utilize them in order to compute the current value
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];  
               }
        
        return dp[n];
    }
}