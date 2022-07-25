class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        Arrays.fill(ans, -1);
        int lo=0;
        int high=nums.length-1;
      
        while(lo<=high){
             int  mid=(lo+high)/2;
            if(nums[mid]==target){
                if(nums[lo]==target && nums[high]==target){
                    ans[0]=lo;
                    ans[1]=high;
                    break;
                }
                if(nums[lo]<target){
                    lo++;
                }
                if(nums[high]>target){
                    high--;
                }
            }
            
         else if(nums[mid]<target){
              lo=mid+1;
          }  
            else{
                high=mid-1;
            }
            
        }
        return ans;
    }
}
// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int l = 0;
//         int r = nums.length-1;
//         while(l <= r){
//             int mid = (l+r)/2;            
//             if(nums[mid] == target){
//                 if(nums[l] == target && nums[r] == target){
//                     return new int[]{l,r};
//                 }
//                 if(nums[l] < target){
//                     l++;
//                 }
//                 if(nums[r] > target){
//                     r--;
//                 }
//             } else if(target < nums[mid]){
//                 r = mid-1;
//             } else {
//                 l = mid+1;
//             }
//         }
//         return new int[]{-1,-1};   
//     }
// }