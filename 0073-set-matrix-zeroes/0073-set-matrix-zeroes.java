class Solution {
    public void setZeroes(int[][] m) {
        int col =1;
        for(int i=0; i<m.length; i++){
            if(m[i][0]==0)col=0;
            for(int j=1; j<m[0].length; j++){
               if(m[i][j]==0){
                   m[i][0]=m[0][j]=0;
                  
               } 
            }
        }
        
        for(int i=m.length-1; i>=0;i--){
            // if(col==0)m[i][0]=0;
            for(int j=m[0].length-1; j>=1; j--){
                if(m[i][0]==0 || m[0][j]==0){
                    m[i][j]=0;
                }
                 // if(col==0)m[i][0]=0;
            }
             if(col==0)m[i][0]=0;
        }
        
    }
}