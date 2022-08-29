class Solution {
    public int numIslands(char[][] grid) {
    int islandsCount = 0;
    
    int m = grid.length;
    int n = grid[0].length;
    int[][] visited = new int[m][n];
 
    for(int i=0; i<m; i++)
    {
        for(int j=0; j<n; j++)
        {
            if(grid[i][j] == '1' && visited[i][j] == 0)
            {
                islandsCount++;
                helper(grid,visited,m,n,i,j);
            }
        }
    }
    
    return islandsCount;
}

public void helper(char[][] grid,int[][] visited,int m, int n, int i, int j)
{
    if(i<0 || j<0 || i>=m || j>=n)
    {
        return;
    }
    else if (visited[i][j] == 0)
    {
        visited[i][j] = 1;
        if(grid[i][j]=='1')
        {
            helper(grid,visited,m,n,i-1,j);
            helper(grid,visited,m,n,i+1,j);
            helper(grid,visited,m,n,i,j+1);
            helper(grid,visited,m,n,i,j-1);
        }
    }
}
}