class Solution {
    public boolean isPowerOfThree(int n) {
   if(n==1)return true;
        double nn=n;
       while(nn>1){
           
           nn= nn/3;
       }
        if(nn==1)return true;
        return false;
    }
}