class Solution {
    public void solveSudoku(char[][] board) {
        func(board);
    }
  boolean  func( char[][] board){
        int n = board.length ;
     int m = board[0].length;
        for(int i = 0 ; i <9 ; i++ ){
            for(int j = 0 ; j <9 ; j++){
                if(board[i][j]=='.'){
                    for(char c = '1'; c<='9'; c++){
                        if(check(board , i , j , c)){
                            board[i][j]=c;
                        
                        if(func(board)== true){
                            return true ;
                        }
                        else
                            board[i][j] = '.';
                        
                        }
                    }
                    return false;
                }
                
            }
        }
        return true;
    }
    
    
    boolean check(char[][]board ,int row , int col , char c){
        for(int i = 0 ; i < 9; i++){
            if(board[row][i]== c){
                return false;
            }
           if(board[i][col]== c){
                return false;
            }
             if (board[3*(row / 3) + (i / 3)][ 3* (col / 3) + i % 3] == c ){
                 return false ;
             }
           
        }
        return true;
    }
}