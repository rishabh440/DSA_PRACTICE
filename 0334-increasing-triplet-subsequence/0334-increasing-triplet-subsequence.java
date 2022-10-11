class Solution {
 public boolean increasingTriplet(int[] nums) {
    int k = 3;
    int[] small = new int[k-1];
    for (int i = 0; i < small.length; i++) {
        small[i] = Integer.MAX_VALUE;
    }
    for (int num : nums) {
        int i = 0;
        while (i < small.length && small[i] < num) {
            i++;
        }
        if (i < small.length) {
            small[i] = num;
        } else {
            return true;
        }
    }
    return false;
}
}