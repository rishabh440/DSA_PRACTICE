class Solution {
    public String reverseWords(String s) {
        String[] parts = s.split(" ");
       
     int start =0;
        int end = parts.length-1;
        while(start<=end){
            String temp = parts[start];
            parts[start] = parts[end];
            parts[end] = temp;
            start++;
                end--;
        }
 
          
        String  ans ="";
        for(int i =0; i<parts.length; i++){
     if(parts[i].length() ==0){
         continue;
     }
       ans  = ans +  " " +  parts[i];
        
        }
  
      return ans.trim();
    }
}