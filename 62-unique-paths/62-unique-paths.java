class Solution {
    public int uniquePaths(int m, int n) {
     int[][] dp = new int[n*m][n*m] ;
      for (int[] row : dp)
            Arrays.fill(row, -1);
      return  func(m , n , 0 , 0 , dp );
       
    }
  int  func(int m , int n, int i , int j , int[][] dp ){
      
        if(i==(n-1) && j==(m-1)) dp[i][j]= 1;
      if(i>=n || j >=m)dp[i][j]= 0;
      if(dp[i][j]!=-1){
          return dp[i][j];
      }
      else return dp[i][j] = func(m , n , i+1 , j , dp) + func(m , n , i ,j+1 , dp);
    }
}