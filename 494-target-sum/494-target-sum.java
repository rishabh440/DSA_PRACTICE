class Solution {
    public int findTargetSumWays(int[] nums, int target) {
          int sum = 0;
        for(int x : nums)
            sum += x;
        if(((sum - target) % 2 == 1) || (target > sum))
            return 0;
        
        int n = nums.length;
        int s2 = (sum - target)/2;
        int[][] t = new int[n + 1][s2 + 1];
        t[0][0] = 1;
        
        for(int i = 1; i < n + 1; i++) {
            for(int j = 0; j < s2 + 1; j++) {
                if(nums[i - 1] <= j)
                    t[i][j] = t[i-1][j] + t[i - 1][j - nums[i - 1]];
                else
                    t[i][j] = t[i - 1][j];
            }
        }
        return t[n][s2];
    }
}
        
//         int sum = 0;
//         for(int i=0;i<nums.length; i++){
//             sum+=nums[i];
//         }
//         if((sum-target)%2==1 || (target>sum)){
//             return 0;
//         }
//         int sum1=(sum-target)/2;
//         return countsum(nums, sum1);
//     }
//     int countsum(int[] nums , int sum){
//         int[][] dp = new int[nums.length+1][sum+1];
        
//        for(int i=0; i<nums.length; i++){
//             for(int j=0; j<sum; j++){
//                 if(i==0){
//                     dp[i][j]= 0;
//                 }
//                 if(j==0){
//                     dp[i][j]= 1;
//                 }
//             }
//         }
      
//             for(int i=1;i<=nums.length;i++){
//            for(int j=1;j<=sum;j++){
//                 if(nums[i-1] <=j){
//                     dp[i][j]= (dp[i-1][j] + dp[i-1][j-nums[i-1]]);
//                 }
//                 else{
//                     dp[i][j]= dp[i-1][j];
//                 }
//             }
//         }
//       return dp[dp.length-1][dp[0].length-1];
//     }
// }
  