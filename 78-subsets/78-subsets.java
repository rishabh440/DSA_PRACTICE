class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // Arrays.sort(nums);
         List<List<Integer>> ans = new   ArrayList<List<Integer>>(); 
         List<Integer> ds = new ArrayList<>();
         solve(ans , ds , nums , 0);
         return ans;
    }
void  solve(  List<List<Integer>> ans , List<Integer> ds , int[] nums , int indx ){
        ans.add(new ArrayList<>(ds));
        
    for(int i=indx; i<nums.length; i++){
        if(i!=indx && nums[i]==nums[i-1])continue;
        ds.add(nums[i]);
        solve(ans , ds , nums , i+1);
        ds.remove(ds.size()-1);
    }
     
    }
}