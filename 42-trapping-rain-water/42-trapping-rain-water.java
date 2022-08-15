class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int lmax=0 , rmax=0 , ans=0;
        int l=0 , r=n-1;
         while(l<r){
             if(height[l]<=height[r]){
                 if(lmax<=height[l])lmax=height[l];
                 else{
                     ans+=lmax-height[l];
                 }
                 l++;
             }
             else{
               if(height[r]>=rmax)rmax=height[r];
                 else{
                     ans+= rmax-height[r];
                 }
                 r--;
             }
         }
        return ans;
    }
}