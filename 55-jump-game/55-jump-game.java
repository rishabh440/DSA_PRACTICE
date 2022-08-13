class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        if(nums.length==1 && nums[0]==0){
            return true;
        }
         for(int i=0; i<nums.length; i++){
        
             max = Math.max(max , i + nums[i]);
             if(max>=nums.length-1)return true;
             if(i==max && nums[max]==0)return false;
             if(i>max)return false;
         }
        return true;
    }
}