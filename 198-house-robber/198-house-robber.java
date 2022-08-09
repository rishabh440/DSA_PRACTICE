class Solution {
    public int rob(int[] nums) {
        int dp[]= new int[nums.length];
        Arrays.fill(dp,-1);
       return solve(nums.length-1, nums , dp);
    }
    int solve(int indx , int[] nums, int[] dp){
      if(indx==0)return nums[indx];
        if(indx<0)return 0;
        if(dp[indx]!=-1)return dp[indx];
        int pick= nums[indx]+ solve(indx-2, nums, dp);
        int notpick= solve(indx-1, nums, dp);
        return dp[indx]=Math.max(pick, notpick);
    }
}