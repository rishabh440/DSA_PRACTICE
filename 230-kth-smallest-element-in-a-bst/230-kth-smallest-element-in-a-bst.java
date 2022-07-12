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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ans= new ArrayList<>();
        func(root , ans);
      
      return     ans.get(k-1);
    }
    
void    func(TreeNode root ,  ArrayList<Integer> ans ){
        if(root==null) return  ;
        func(root.left , ans);
        ans.add(root.val);
        func(root.right , ans);
        
        
    }
}