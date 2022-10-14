class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            ans = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(i==j || j==0){
                    ans.add(1);
                }
                else{
                    ans.add(pre.get(j) + pre.get(j-1));
                }
            }
             pre= ans;
            res.add(pre);
        }
        return res;
    }
}