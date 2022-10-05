class Solution {
    private static final int MODULO = 1000000007;
    public int numRollsToTarget(int n, int k, int target) {
        int[] dp0 = new int[target + 1];
        int[] dp1 = new int[target + 1];
        dp1[0] = 1;
        for(int i = n - 1; i >= 0; --i) {
            for(int remain = target; remain > 0; --remain) {
                int ans = 0;
                for(int num = 1; num <= k; ++num) {
                    if(remain - num >= 0) {
                        ans += dp1[remain - num];
                        ans %= MODULO;
                    }
                }
                dp0[remain] = ans;
            }
            
            Arrays.fill(dp1, 0);
            int[] tmp = dp0;
            dp0 = dp1;
            dp1 = tmp;
        }
        return dp1[target];
    }
}