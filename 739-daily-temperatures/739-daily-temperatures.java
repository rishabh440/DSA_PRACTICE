class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(temperatures[i]<temperatures[j]){
                     ans[i]= j-i;
                    break;
                }
            }
        }
        return ans;
    }
}