class Solution {
    Integer[][][] memo;
    public int getLengthOfOptimalCompression(String s, int k) {
        List<int[]> count = new ArrayList<>();
        char lc = ' ';
        int cn = 0;
		
        for (char c : s.toCharArray()) {
            if (lc != c) {
                if (cn != 0) count.add(new int[] { lc-'a', cn });
                cn = 1;
                lc = c;
            } else {
                cn++;
            }
        }
        count.add(new int[] { lc-'a', cn });
        memo = new Integer[count.size() + 1][k + 1][s.length() + 1];
        return f(count, 0, 0, k);
    }
    
	
    int f(List<int[]> count, int a, int i, int k) {
        if (i == count.size()) return 0;
        if (memo[i][k][a] != null) return memo[i][k][a]; // we hit the cache
        int[] curr = count.get(i);
        int c = curr[1] + a;
		
        int best = l(c) + f(count, 0, i + 1, k); // first just try to keep everything
		
		// we are interested in game-changes only, like a10 -> a9, when string gets shorter
        for (int q : new int[] {0, 1, 9}) {
		    int toRemove = c - q; // how many chars to be removed to achieve q
            if (toRemove <= k && q < c) 
                best = Math.min(best, f(count, 0, i + 1, k - toRemove) + l(q));
        }
		
		// now let's handle the case like `aabbaa` -> `aaaa`
        int res = k;
	
        for (int j = i + 1; j < count.size() && res >= 0; j++) {
            int[] next = count.get(j);
            if (next[0] == curr[0]) {
                best = Math.min(best, f(count, c, j, res));
				// no need to try removing the same characters
				break;
            }
            res -= next[1];
        }
        memo[i][k][a] = best;
        return best;
    }
    
	// length of char + its count, where n is a count of that char
	// if n == 15, l(15) = 3 -> e.g. `a15`
    int l(int n) {
        if (n <= 1) return n;
        if (n < 10) return 2;
        if (n < 100) return 3;
        return 4;
    }
}