class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();
        List<Integer> pre = new ArrayList<Integer>();
        for(int i=0; i<n ; i++){
            row = new ArrayList<Integer>();
            for(int j=0; j<i+1; j++){
                if(i==j || j==0){
                    row.add(1);
                }else{
                    row.add(pre.get(j)+ pre.get(j-1));
                }
                
            }
            pre= row;
            ans.add(row);
        }
        return ans;
    }
}