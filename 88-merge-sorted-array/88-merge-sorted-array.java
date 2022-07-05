class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
        
   for(int i =0 ; i<m ; i++){
      if(n==0)break;
            if(nums1[i] >= nums2[0]){
                int temp = nums1[i];
                nums1[i]= nums2[0];
                nums2[0] = temp;
            }
        Arrays.sort(nums2);
   }
        int i=m;
           if(i == m ){
               int j=0;
             while(j!=n){
                 nums1[i]= nums2[j];
                     i++;
                 j++;
                 }
           
            
         
        }
   
        
    }
}