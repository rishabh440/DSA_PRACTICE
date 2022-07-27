class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        if(amount==0)
            return 0;
        if(n==0)
            return -1;
        int[][] dp = new int[n+1][amount+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(j==0){
                    dp[i][j]=0;
                }
                if(i==0){
                    dp[i][j]=Integer.MAX_VALUE -1;
                }
            }
        }
  
        for(int j=1; j<amount+1; j++){
                  if(j%coins[0]==0){
                dp[1][j]=j/coins[0];
            }
            else{
                
                dp[1][j]=Integer.MAX_VALUE-1; 
            }
        }
        for(int i=2; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
     if(coins[i-1]<=j){
         dp[i][j]= Math.min(dp[i-1][j] , dp[i][j-coins[i-1]] +1);
     }   
        else{
            dp[i][j]= dp[i-1][j];
        }
            }
        }
       return dp[n][amount]== Integer.MAX_VALUE - 1 ? -1 : dp[n][amount];
    }
}
