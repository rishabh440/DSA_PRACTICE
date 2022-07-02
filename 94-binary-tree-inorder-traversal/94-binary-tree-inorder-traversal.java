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
        ArrayList<Integer> ans = new ArrayList<>();
        ioder(ans , root);
        return ans;
    }
    void ioder(ArrayList<Integer> ans ,TreeNode node){
        if(node==null) return ;
        
        ioder(ans , node.left);
        ans.add(node.val);
        ioder(ans ,node.right);
    }
}