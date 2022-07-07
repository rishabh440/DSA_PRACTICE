class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2; i++){
            if(i==0 || (i>0 && nums[i] != nums[i-1])){
            int ftar= 0-nums[i];
            int low =i+1;
            int high= nums.length-1;
            while(low<high){
                if(ftar== (nums[low] + nums[high])){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[low]);
                    temp.add(nums[high]);
                    ans.add(temp);
                    
                    while(low<high && nums[low]==nums[low+1])low++;
                    while(low<high && nums[high]==nums[high-1])high--;
                    low++;
                    high--;
                }           
               else if(ftar > nums[low]+ nums[high]){
                    low++;
                }
                else{
                    high--;
                }
                
            }
        }   
        }
        return ans;
        }
}