class Solution {
    public int longestConsecutive(int[] nums) {
    
         Set < Integer > hashSet = new HashSet < Integer > ();
        for(int num:nums){
            hashSet.add(num);
        }
        int ls=0;
        for(int num:nums){
            if(!hashSet.contains(num-1)){
                int curnum = num;
                int curs = 1;
            
            
            while(hashSet.contains(curnum+1)){
                curnum++;
                curs++;
            }
            
            
            ls = Math.max(curs, ls);
            }
        }
        return ls;
    }
}