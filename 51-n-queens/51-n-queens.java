class Solution {
    public List<List<String>> solveNQueens(int n) {
      List < List < String >> res = new ArrayList < List < String >> ();
        char[][] board = new char[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                board[i][j] = '.';
            }
        }
        int[] leftrow = new int[n];
         int[] lowerd = new int[2* n - 1];
         int[] upperd = new int[2*n - 1];
        
        func(0 , board ,  res , leftrow, lowerd , upperd);
        return res;
    }
    
    void func(int col , char[][] board , List<List<String>> res , int[] leftrow ,int[] lowerd ,int[] upperd){
        if(col==board.length){
            res.add(contruct(board));
            return;
        }
        for(int row =0 ; row <board.length; row++){
            if(leftrow[row]==0 && lowerd[row+ col] == 0 && upperd[(board.length-1) + (col-row)] == 0){
                board[row][col] = 'Q';
                leftrow[row] = 1;
                lowerd[row+ col] = 1;
                upperd[(board.length-1) + (col-row)] =1;
                func( col+ 1, board , res , leftrow , lowerd ,upperd );
                board[row][col] = '.';
                leftrow[row] = 0;
                lowerd[row+ col] = 0;
                upperd[(board.length -1) + (col-row)] =0;
                 
            }
        }
    }
    List<String> contruct(char[][] board){
         List<String> res = new ArrayList<String>();
        for(int i =0; i<board.length ; i++){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}