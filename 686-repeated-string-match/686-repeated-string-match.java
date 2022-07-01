class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count =1;
        String ans = a;
        int repeat = b.length()/a.length() + 2;
        for(int i =0; i<repeat; i++){
            if(a.contains(b)){
                return count;
            }
            else{
                a += ans;
                count++;
            }
        }
        return -1;
    }
}