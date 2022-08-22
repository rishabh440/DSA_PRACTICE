class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)return true;
        float nn=n;
       while(nn>1){
           
           nn= nn/4;
       }
        if(nn==1)return true;
        return false;
    }
}