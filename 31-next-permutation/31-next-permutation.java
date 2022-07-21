class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i >=0 && nums[i]>=nums[i+1])i--;
      int j = nums.length - 1;
        if(i>=0){
        while(j>=0 && nums[j]<=nums[i])j--;
        swap(nums , i , j);
        }
        reverse(nums , i+1 ,nums.length-1);
    }
    void swap(int[] nums , int i , int j ){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
void    reverse(int[] nums , int i , int j ){
        while(i<=j){
        swap(nums , i++ , j--);
            }
    }
}