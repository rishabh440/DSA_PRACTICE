class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character ,Integer> map =  new HashMap<Character, Integer>();
         for(int i=0; i<s.length(); i++){
           if(map.containsKey(s.charAt(i))){
               map.put(s.charAt(i) , map.get(s.charAt(i)) +1);
            
           }
             else{
                  map.put(s.charAt(i) , 1);
             }
                 
             }
        int i=0;
          
        while(i<s.length()){
            if(map.get(s.charAt(i))==1){ 
                break;
            }
            else i++;
        }
        // char c ;
        // for (Map.Entry entry : map.entrySet()) {
        //   if(entry.getValue()==1){
        //     c=  entry.getKey();
        //       break;
        //   }
        // }
        // for(int i=0; i<s.length();i++){
        //     if(charAt(i)==c)break;
        // }
        if(i==s.length())return -1;
        else return i;
         }
    }
