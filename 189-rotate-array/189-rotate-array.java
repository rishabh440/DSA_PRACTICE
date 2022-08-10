class Solution {
    public void rotate(int[] nums, int k) {
        
      int j=0;
       int n = nums.length;
         if(k>n){
                k=k%n;
            }
          int[] ans = new int[n];
        if(k==0 || n/k==0){
             System.out.println(k);
        }
        else{
           
             System.out.println(k);
            for(int i=n-k; i<n; i++){
                ans[j]= nums[i];
                j++;
            }
            for(int i=0; i<n; i++){
                System.out.println(ans[i]);
            }
            
            for(int i=0; i<n-k; i++){
                ans[j]=nums[i];
                j++;
            }
            for(int i=0; i<n; i++){
                nums[i]= ans[i];
            }
        }
        
    }
}