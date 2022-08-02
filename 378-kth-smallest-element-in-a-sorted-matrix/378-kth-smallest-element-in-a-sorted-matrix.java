class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                max.offer(matrix[i][j]);
                if(max.size()>k){
                    max.poll();
                }
            }
        }
        return max.peek();
    }
}