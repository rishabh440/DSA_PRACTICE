class Solution {
    public boolean isSubsequence(String s, String t) {
//         for(int i=0 ; i<t.length(); i++){
//           System.out.println("before" + t.indexOf(s));   
//         if(t.indexOf(s)!=0){
//         System.out.println(t.indexOf(s));
//             s= s.substring( 0 , s.length()-1);
            
//         }
            
//         }
//         if(s.length()==0){
//             return true;
//         }
//         return false;
//     }
        
          int i = 0;
    for(int j = 0;j<t.length() && i<s.length();j++)
     if(t.charAt(j) == s.charAt(i)) i++;
    return i == s.length();  
    }
}