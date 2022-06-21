class Solution {
    void func(int indx , int[] nums , List<List<Integer>> ans ){
        if (indx == nums.length) {
            
            List < Integer > ds = new ArrayList < > ();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList < > (ds));
            return;
        }
        for(int i =indx ; i<nums.length; i++){
            swap(nums , i , indx);
            func(indx + 1 , nums , ans );
            swap(nums , i , indx);
        }
    }
    void swap(int[] nums , int i , int j ){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
      
        func(0 , nums , ans  );
        return ans;
    }
}