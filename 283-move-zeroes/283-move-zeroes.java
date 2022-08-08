class Solution {
    public void moveZeroes(int[] nums) {
      for (int lastNonZeroFoundAt = 0, cur = 0; cur < nums.length; cur++) {
        if (nums[cur] != 0) {
            swap( nums ,lastNonZeroFoundAt++, cur);
        }
      }
    }
        void swap(int[] nums , int i , int j){
            int temp= nums[i];
            nums[i]= nums[j];
            nums[j]= temp;
        }
    }