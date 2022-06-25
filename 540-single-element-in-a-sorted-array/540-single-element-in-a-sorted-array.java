class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i = 0;
        int ans = 0;
        if(nums.length==1){
            return nums[i];
        }
        while(i<nums.length){
            if(i==nums.length -1 ){
                return nums[i];
            }
        if(nums[i]== nums[i+1]){
            i=i+2;
        }
            else{
             ans= nums[i];
                break;
            }
        }
       return ans;  
        
    }
}