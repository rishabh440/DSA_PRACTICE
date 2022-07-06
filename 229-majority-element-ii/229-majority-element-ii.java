class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0 , c2 =0, candi1=0, candi2=0;
        int fc=0 , fc1 =0;
        List<Integer> ans = new ArrayList<>();
        for(int num : nums){
             if(candi1==num)c1++;
            else if(candi2==num)c2++;
             else   if(c1==0){
                candi1= num;
                 c1=1;
            
            }
            else if(c2==0){
                candi2=num;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        
        for(int i =0; i<nums.length; i++){
            if(nums[i]==candi1){
                fc++;
            }
            else if(nums[i]==candi2){
                fc1++;
            }
    }
        
        if(fc>(nums.length/3)) ans.add(candi1);
        if(fc1>(nums.length/3)) ans.add(candi2);
        return ans;
}
}