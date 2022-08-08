class Solution {
   
    public int lengthOfLIS(int[] nums) {
           int[][] dp = new int[nums.length][nums.length+1]; 
        for(int[] rows: dp){
            Arrays.fill(rows,-1);
        }
      return  solve(nums ,0 , -1 , dp);
        
    }
   int solve(int[] nums , int indx , int prev , int[][] dp){
        if(indx==nums.length)return 0;
       
       if(dp[indx][prev+1]!=-1)return dp[indx][prev+1];
       
       int len= solve(nums, indx+1 , prev , dp);
       
       if(prev==-1 || nums[indx]>nums[prev]){
           len = Math.max(len, 1+ solve(nums , indx+1 , indx, dp));
           
       }
       return dp[indx][prev+1]= len;
    }
}