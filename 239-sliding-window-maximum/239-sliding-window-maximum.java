class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        int ri =0;
        int n = a.length ;
        int[] ans= new int[n-k+1];
        Deque<Integer> q = new ArrayDeque<>();
        for(int i =0 ; i<n ; i++){
            if(!q.isEmpty() && q.peek()== i-k){
                q.poll();
            }
            while(!q.isEmpty() && a[q.peekLast()] <= a[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                ans[ri++] =  a[q.peek()];
            }
      
        }
        return ans;
    }
}