class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int i=0;
        int count =0;
        while(i<nums.length){
            if(nums[i]==1){
                count++;
                if(max<count){
                    max= count;
                }
            }
            else{
                count=0;
            }
            i++;
        }
        return max;
    }
}