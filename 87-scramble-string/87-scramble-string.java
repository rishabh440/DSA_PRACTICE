class Solution {
       Map<String, Boolean> mp = new HashMap<>();
    boolean[][] dp= new boolean[31][31];
    public boolean isScramble(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.length()==0 || s2.length()==0)return true;
        
        return solve(s1 , s2);
    }
    boolean solve(String a , String b){
        if(a.equals(b)==true)return true;
        if(a.length()<=1)return false;
        int n = a.length();
        boolean flag= false;
        
        String key = a;
        
        key += ' ' + b;
        
        if(mp.containsKey(key))
             return mp.get(key);
        for(int i=1; i<=n-1; i++){
          boolean swap=  solve(a.substring(0,i),b.substring(n-i)) && solve(a.substring(i),b.substring(0,n-i));
            boolean unswap= solve(a.substring(0,i) , b.substring(0,i)) && solve(a.substring(i) , b.substring(i));
            
            if(swap || unswap){
                flag =true;
                break;
            }
        }
         mp.put(key, flag);
        return flag;
    }
}
