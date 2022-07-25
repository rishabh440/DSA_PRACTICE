class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        Arrays.fill(ans, -1);
        if(nums.length==1 && nums[0]==target){
            ans[0]=0;
            ans[1]=0;
            return ans;
        }
        for(int i=0; i<nums.length;i++){
            if(nums[i]==target){
                ans[0]=i;
                break;
            }
        }
        if(ans[0]>=0){
        for(int i=ans[0]; i<nums.length; i++){
            if(nums[i]== target){
                ans[1]=i;
            }
        }
        }
        return ans;
    }
}