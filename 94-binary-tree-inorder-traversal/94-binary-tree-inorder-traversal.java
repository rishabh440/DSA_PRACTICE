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
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode node = root;
        List<Integer> ans = new ArrayList<>();
        while(node!=null){
            if(node.left==null){
                ans.add(node.val);
                node = node.right;
            }
            else{
                TreeNode perv = node.left;
                while(perv.right!=null && perv.right!=node){
                    perv= perv.right;
                }
                if(perv.right==null){
                    perv.right= node;
                    node= node.left;
                }
                else{
                    perv.right = null;
                    ans.add(node.val);
                    node = node.right;
                }
            }
        }
        return ans;
        
    }
}