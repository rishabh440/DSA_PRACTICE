class Solution {
    public boolean isPalindrome(int x) {
        if (x <0 ){
            return false;
        }
       int temp = x ;
         int  rev =0;
        int rem =0;
        while(temp != 0){
            rem = temp % 10;
            rev = (rev * 10) + rem ;
            temp = temp/10;
        }
        
        if (rev==x){
            return true;
            
        }
        else{
            return false;
        }
        
    }
}