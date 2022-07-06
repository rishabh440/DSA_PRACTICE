class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0 || nums== null){
            return 0;
        }
        Arrays.sort(nums);
        int pre = nums[0];
        int cnt =1;
        int ans =1;
        for(int i =1; i< nums.length ;i++){
            if(nums[i]== pre+1){
                cnt ++;
            }else if(nums[i]!=pre){
                cnt =1;
            }
            pre= nums[i];
            ans =Math.max(ans , cnt);
        }
        return ans;
    }
}