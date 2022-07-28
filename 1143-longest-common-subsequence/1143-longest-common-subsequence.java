class Solution {
    
    public int longestCommonSubsequence(String x, String y) {
        int n = x.length();
        int m = y.length();
        int[][] dp = new int[n+1][m+1];
           for(int rows[]:dp)
        Arrays.fill(rows,-1);
        lcs(x, y, n , m, dp);
        return dp[n][m];
    }
   int lcs(String x , String y , int n , int m ,int[][] dp ){
       if(n==0 || m==0){
           return 0;
       }
       if(dp[n][m]!=-1){
           return dp[n][m];
       }
       if(x.charAt(n-1)== y.charAt(m-1)){
    return    dp[n][m]= 1+ lcs(x, y, n-1, m-1 , dp);
       }
       else
       return    dp[n][m]= Math.max(lcs(x, y , n-1, m , dp) , lcs(x,y,n, m-1 , dp));
       
      
   }
}
// class Solution {
//     public int longestCommonSubsequence(String a, String b) {

//         int x=a.length();
//         int y=b.length();
//         int dp[][]=new int[x][y];
        
//         for(int rows[]:dp)
//         Arrays.fill(rows,-1);
        
//         return lcs(x-1,y-1,a,b,dp);
//     }
    
//     public int lcs(int ind1,int ind2,String a,String b,int [][]dp)
//     {
//         if(ind1<0 || ind2<0) return 0;
        
//         if(dp[ind1][ind2]!=-1) return dp[ind1][ind2];
        
//         if(a.charAt(ind1)==b.charAt(ind2))
//         return dp[ind1][ind2]=1+lcs(ind1-1,ind2-1,a,b,dp);
        
//         else
//         return dp[ind1][ind2]=Math.max(lcs(ind1-1,ind2,a,b,dp),lcs(ind1,ind2-1,a,b,dp));
//     }
// }