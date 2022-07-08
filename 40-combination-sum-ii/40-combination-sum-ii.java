class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        func(0 ,ans , new ArrayList<>()  ,  candidates , target);
        return ans;
    }
    void func(int indx , List<List<Integer>> ans , List<Integer> ds , int[] candidates ,int target){
      
            if(target==0){
                ans.add(new ArrayList<>(ds));
                    return;
            }
        
        
        for(int i= indx ; i<candidates.length ; i++){
            if(i!=indx && candidates[i]==candidates[i-1])continue;
            if(candidates[i]>target)break;
            ds.add(candidates[i]);
            func(i + 1 , ans , ds , candidates , target - candidates[i]);
            ds.remove(ds.size() - 1);
            
        }
    }
}