class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
      
        int moves=0;
        int mid = nums[n/2];
        for(int i=0; i<n ;i++){
            moves += Math.abs(nums[i] - mid) ;
        }
        return moves;
    }
}