class Solution {
    public int longestPalindromeSubseq(String s) {
        String rev = reverse(s);
        // String ans = lcs(s , rev);
        
        return lcs(s , rev);
    }
    String reverse(String Str){
         String rev = "";
    
 for(int i = Str.length() - 1; i >= 0; i--)
 {
 rev = rev + Str.charAt(i);
 }
        return rev;
    }
    int lcs(String text1 , String text2){
       int l1 = text1.length();
        int l2 = text2.length();
        int[][] dp = new int[l1+1][l2+1];
        
        for(int i = 0 ; i < l1+1 ; i++)
            dp[i][0] = 0;
        
        for(int j = 0 ; j < l2+1 ; j++)
            dp[0][j] = 0;
        
         for(int i = 1 ; i < l1+1 ; i++)
            for(int j = 1 ; j < l2+1 ; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i][j-1] , dp[i-1][j]);
            }
        
        return dp[l1][l2];
        
    }
}