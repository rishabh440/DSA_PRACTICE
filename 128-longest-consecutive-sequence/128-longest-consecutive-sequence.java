class Solution {
    public int longestConsecutive(int[] nums) {
    
         Set < Integer > hashSet = new HashSet < Integer > ();     
       for(int num:nums){
            hashSet.add(num);
        }
        int ls =0;
        
        for(int num: nums){
            if(!hashSet.contains(num-1)){
              int   cn = num;
               int  cs=1;
           
            while(hashSet.contains(cn + 1)){
              cs++;
               cn++;
            }
           
            ls = Math.max(ls,cs);
            }
        }
        return ls;
    }
}