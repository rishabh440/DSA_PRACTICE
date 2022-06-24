class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        func(0 , candidates,target, ans , ds); 
            return ans ;    
    }
 void   func(int indx ,int[] candidates, int target , List<List<Integer>> ans, List<Integer> ds ){
        
            if(target == 0){
               ans.add(new ArrayList<>(ds));
            }
      
    
        for(int i = indx ; i < candidates.length ; i++){
            if(i>indx && candidates[i]==candidates[i-1])continue;
        if(candidates[i]>target)break;
            
            ds.add(candidates[i]);
            func(i + 1, candidates, target - candidates[i], ans , ds );
           
            ds.remove(ds.size()-1);
        
        }
    }
}