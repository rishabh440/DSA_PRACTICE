class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        func(0 , s , ans , new ArrayList<>());
        return ans;
    }
   void func(int indx , String s , List<List<String>> ans , List<String> ds){
        if(indx==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i= indx ; i<s.length(); i++){
            if(ispalindrome(s , indx , i)){
            ds.add(s.substring(indx , i+1));
            func(i+1 , s , ans , ds);
            ds.remove(ds.size()-1);
            }
        }
    }
 boolean  ispalindrome(String s , int start , int end ){
        while(start<=end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
     return true;
    }
    }