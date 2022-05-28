class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int i = 0 ;
        while(i<matrix.length ){
             if(matrix[i][matrix[0].length-1]> target ){ 
                break;
             }
         
            else if(matrix[i][matrix[0].length-1]<target ){
                i++;
            }
            else {
                return true;
            }
        }
        int j =0;
        // i = 1, j=0
        
        while(i < matrix.length && j < matrix[0].length && matrix[i][j]!= target){
            
            j++;
        }

        if(i < matrix.length && j < matrix[0].length && matrix[i][j] == target) return true;
        
    
        return false;
    }
}