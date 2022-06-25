class Solution {
    public int search(int[] nums, int target) {
        int flag = 1;
        int ans = 0;
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i]== target){
                 flag = 0;
                ans = i;
                break;
            }
        }
       if(flag == 0){
           return ans;
       }
        else{
            return -1;
        }
    }
}