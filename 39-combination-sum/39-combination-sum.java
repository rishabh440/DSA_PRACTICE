class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        func(0 , candidates,target, ans , ds); 
            return ans ;
        
    }
 void   func(int indx ,int[] candidates, int target , List<List<Integer>> ans, List<Integer> ds ){
        if(indx == candidates.length){
            if(target == 0){
               ans.add(new ArrayList<>(ds));
            }
            return;
        }
        
        if(candidates[indx]<=target){
            ds.add(candidates[indx]);
            func(indx ,candidates , target - candidates[indx], ans , ds );
           
            ds.remove(ds.size()-1);
        }
      func(indx + 1, candidates, target, ans , ds );
    }
}