class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(0, s , res , path);
        return res;
    }
    
    void func(int indx , String s , List<List<String>> res , List<String> path ){
        if(indx == s.length()){
            res.add( new ArrayList<>( path));
            return ;
        }
        
         for( int i = indx ; i<s.length(); i++){
             if(palindrome(s , indx , i)){
                 path.add(s.substring(indx , i + 1));
                 func(i + 1 , s , res , path);
                 path.remove( path.size() - 1);
             }
             
         }
        
    }
     boolean  palindrome( String s , int start , int end){
         while(start<= end){
             if(s.charAt(start++)!= s.charAt(end--)){
                 return false;
             }
             
         }
         return  true;
     }
}