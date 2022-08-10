class Solution {
    public int countSubstrings(String str) {
        if(str == null || str.length() < 1) return 0;
        int count = 0;
        for(int i=0;i<str.length();i++){
            count += countPalindromes(str, i, i); //Count even sized
            count += countPalindromes(str, i, i+1); //Count odd sized
        }
        return count;
    }
    
    private int countPalindromes(String str, int s, int e){
        int count = 0;
       // if( s>=0 && e<str.length() && str.charAt(s) == str.charAt(e) )
       //  count++;
        while(s>=0 && e<str.length() && str.charAt(s) == str.charAt(e)){
            s--;
            e++;
            count++;
        }
        return count;
    }
}