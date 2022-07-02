/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack <TreeNode> st = new Stack<TreeNode>();
        ArrayList<Integer> ans = new ArrayList<>();
          TreeNode node = root;
     
      
        while(node!=null || !st.isEmpty()){
            if(node!=null){
                st.push(node);
                node=node.left;
            }
            else{
             TreeNode  temp = st.peek().right;
                if(temp==null){
                    temp = st.peek();
                    st.pop();
                    ans.add(temp.val);
                    while(!st.isEmpty() && temp==st.peek().right){
                        temp = st.peek();
                        st.pop();
                        ans.add(temp.val);
                    }
                }else node = temp;
          
            }
           
        }
        return ans;
    }
}