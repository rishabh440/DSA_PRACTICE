class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
         Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        
    int count = 0, ans=0;
    for(int[] b : boxTypes){
        count = Math.min(b[0] , truckSize);
        ans+=count* b[1];
        truckSize-=count;
        if(truckSize==0) return ans;
    }
        return ans;
        } 
}