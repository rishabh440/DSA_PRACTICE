class Solution {
    void func( int indx  , int[] arr , int target  ,  List<List<Integer>> ans , List<Integer> ds ){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
        }
        for(int i =indx ; i <arr.length ; i++){
            if(i>indx && arr[i] == arr[i-1])continue;
            if(arr[i]> target) break;
            
            ds.add(arr[i]);
            func(i + 1 , arr , target - arr[i] , ans , ds );
            ds.remove(ds.size()-1);
            
        }
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        func( 0 , candidates , target , ans , new ArrayList<>());
        return ans;
    }
}