class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        
        for(int i =0 ; i<s.length() ; i++){
            freq[s.charAt(i)- 'a']++;
        }
        
        Set<Integer> st = new HashSet<>();
        int del =0;
        
        for(int i=0; i<26; i++){
            int curf = freq[i];
            
            while(curf>0){
               if(st.contains(curf)){
                   curf--;
                   del++;
               }
                else{
                    break;
                }
            }
            if(curf!=0){
                st.add(curf);
                
            }
        }
        return del;
    }
}