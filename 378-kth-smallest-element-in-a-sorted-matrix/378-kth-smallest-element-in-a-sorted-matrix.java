class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int lo=matrix[0][0]; 
        int high= matrix[matrix.length-1][matrix[0].length-1];
        while(lo<high){
          int  mid = lo+ (high-lo)/2;
            int count = check(matrix , mid);
            if(count<k) lo= mid+1;
            else{
                high = mid;
            }
        }
        return lo;
    }
    int check(int[][] matrix , int tar){
        int cnt =0; 
        int n = matrix.length;
        int i= 0;
        int j=matrix.length-1;
        while(j>=0 && i<n){
            if(matrix[i][j]>tar)j--;
            else{
                cnt+= j + 1;
                i++;
            }
        }
        return cnt;
    }
}