// class Solution {
//     int[] dp = new int[46];
       
//     public int climbStairs(int n) {
//           Arrays.fill(dp,-1);
//         if (n == 0) {
//             return 0;
//         }
//         if (n == 1) {
//             return 1;
//         }
//         if (n == 2) {
//             return 2;
//         }
//         if(dp[n]!=-1)return dp[n];
//         return dp[n]= climbStairs(n - 1) + climbStairs(n - 2);
//     }
// }
class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(1, 1);
        memo.put(2, 2);
        return climbStairs(n, memo);
    }

    private int climbStairs(int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        memo.put(n, climbStairs(n - 1, memo) + climbStairs(n - 2, memo));
        return memo.get(n);
    }
}