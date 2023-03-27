//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int countDistinctIslands(int[][] grid) {
        // Your Code here
        int n= grid.length;
        int m = grid[0].length;
        HashSet<ArrayList<String>> set = new HashSet<>();
        int[][] vis = new int[n][m];
        
        for(int i=0; i<n ; i++){
            for(int j=0; j<m; j++){
                if(vis[i][j]!=1 && grid[i][j]==1){
                    ArrayList<String> ans = new ArrayList<>();
                    dfs(i , j , vis , grid , i , j ,ans);
                    set.add(ans);
                }
            }
        }
        return set.size();
    }
     String toString( int r , int s){
            return Integer.toString(r) + " "  + Integer.toString(s);
        }
    void dfs(int row , int col , int[][] vis , int grid[][] , int row0 , int col0 , ArrayList<String> ans){
        vis[row][col]=1;
        int n = grid.length;
        int m = grid[0].length;
        ans.add(toString(row-row0 , col- col0));
        int dr[]= {0 ,1,-1,0};
        int dc[]= {1,0,0,-1};
        for(int i=0; i<4; i++){
            int nrow = dr[i] + row;
            int ncol= dc[i] + col;
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]!=1 && grid[nrow][ncol]==1){
                dfs(nrow , ncol , vis , grid , row0 , col0 , ans);
            }
            }
        
        }
      
}
