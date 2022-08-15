class Solution {
    public int trap(int[] height) {
      int n = height.length;
        int ans =0;
        int[] pre = new int[n];
        int[] suffix = new int[n];
        int   lemax=0 , remax=0;
        for(int i=0; i<n; i++){
           lemax= Math.max(lemax , height[i]);
            pre[i]= lemax;
          
        }
          for(int i=n-1; i>=0; i--){
           remax= Math.max(remax , height[i]);
            suffix[i]= remax;
          
        }
        for(int i=0; i<n; i++){
           
            
            ans+= Math.min(pre[i], suffix[i])- height[i];
        }
        return ans;
    }
}