class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
         ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if (num == null || num.length == 0)
            return res;        
        int n = num.length;    
        Arrays.sort(num);     
        for (int i = 0; i < n; i++) {        
            int target_3 = target - num[i];        
            for (int j = i + 1; j < n; j++) {
                            int target_2 = target_3 - num[j];            
                int front = j + 1;
                int back = n - 1;            
                while(front < back) {
                
                    int two_sum = num[front] + num[back];
                
                    if (two_sum < target_2) front++;
                
                    else if (two_sum > target_2) back--;
                
                    else {
                    
                        List<Integer> quad = new ArrayList<>(); 
                        quad.add(num[i]);
                        quad.add(num[j]);
                        quad.add(num[front]);
                        quad.add(num[back]);
                        res.add(quad);      
                        while (front < back && num[front] == quad.get(2)) ++front;

                        while (front < back && num[back] == quad.get(3)) --back;
                
                    }
                }
                while(j + 1 < n && num[j + 1] == num[j]) ++j;
            }
        
            while (i + 1 < n && num[i + 1] == num[i]) ++i;      
        }       
        return res;
    }
}