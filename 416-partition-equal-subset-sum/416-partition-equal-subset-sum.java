class Solution {
    public boolean canPartition(int[] nums) {
        int sum =0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        if(sum%2!=0){
            return false;
        }
       
        return subsetsum(nums , sum/2);
        
    }
  boolean  subsetsum(int[] nums , int sum ){
        boolean[][] dp = new boolean[nums.length+1][sum +1];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<sum; j++){
                if(i==0){
                    dp[i][j]= false;
                }
                if(j==0){
                    dp[i][j]= true;
                }
            }
        }
      
            for(int i=1;i<=nums.length;i++){
           for(int j=1;j<=sum;j++){
                if(nums[i-1] <=j){
                    dp[i][j]= (dp[i-1][j] || dp[i-1][j-nums[i-1]]);
                }
                else{
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
      return dp[dp.length-1][dp[0].length-1];
    }
}
// class Solution {
//     public boolean canPartition(int[] nums) {
//         int sum = 0; // find total elements sum
//         for(int x : nums) sum += x;
        
//         if(sum%2 != 0) return false; // false if sum is odd
        
//         // rows indicates nums elements
//     // cols indicates target to achieve with corresponding row elements
//         boolean[][] dp = new boolean[nums.length+1][(sum/2)+1];
        
//         // make 1st col as true (beacuse every set/element will sums up to 0)
//         for(int i=0;i<dp.length;i++) dp[i][0] = true; 
        
//         for(int i=1;i<dp.length;i++){
//             for(int j=1;j<dp[0].length;j++){
//                 dp[i][j] = dp[i-1][j]; // copy same as top cell
                
//                 if(j >= nums[i-1])
//                     dp[i][j] = (dp[i-1][j] || dp[i-1][j-nums[i-1]]);
//             }
//         }
//         // true -> if equal sum partition possible
//         return dp[dp.length-1][dp[0].length-1];
//     }
// }
