class Solution {
    public int largestRectangleArea(int[] heights) {
        int  max =0;
        Stack<Integer> st  = new Stack<>();
       int n = heights.length;
        for(int i =0 ; i<=n ; i++){
            while(!st.isEmpty() && (i==n || heights[st.peek()]>=heights[i])){
                int height = heights[st.peek()];
                st.pop();
                int width;
                if(st.isEmpty()) width =i;
                else width = i-st.peek()-1;
                
                max = Math.max(max , height * width);
                
            }
            st.push(i);
        }
        
        return max;
    }
}