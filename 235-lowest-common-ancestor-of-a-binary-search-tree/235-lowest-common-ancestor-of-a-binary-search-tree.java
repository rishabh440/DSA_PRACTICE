/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        int cur = root.val;
        if(cur>p.val && cur>q.val){
           return lowestCommonAncestor( root.left,  p,  q);
        }
        if(cur < p.val && cur < q.val){
           return lowestCommonAncestor( root.right,  p,  q);
        }
     
            return root;
     
        
    }
}