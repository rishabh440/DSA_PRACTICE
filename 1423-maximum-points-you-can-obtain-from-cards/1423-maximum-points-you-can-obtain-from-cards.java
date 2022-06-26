class Solution {
    public int maxScore(int[] card, int k) {
       int sum = 0;
        for(int i:card){
            sum+=i;
        }
        int ans =0 , w=0, n = card.length;
        if(n==k){
            return sum;
        }
        for(int i = 0 ; i<n-k-1; i++){
            w+= card[i];
        }
        
        for(int i=n-k-1; i<n; i++){
            w+=card[i];
            ans= Math.max(ans,sum-w);
            w-=card[i-(n-k-1)];
        }
        return ans;
    }
}