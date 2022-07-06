class Solution {
    public int longestConsecutive(int[] nums) {
       int ls =0;
        Set<Integer> set = new HashSet<Integer>();
        for(int num:nums){
            set.add(num);
        }
        for(int num : nums){
            if(!set.contains(num-1)){
              int cs =1 ;
                int curnum = num;
            
            while(set.contains(curnum+1)){
                cs++;
                curnum= curnum+1;
                
            }
            
            ls= Math.max(ls , cs);
           
        }
    }
       return ls; 
}
}