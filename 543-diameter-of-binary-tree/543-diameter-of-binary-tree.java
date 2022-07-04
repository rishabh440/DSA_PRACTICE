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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] dia = new int[1];
        diam(root , dia);
        return dia[0];
    }
  int  diam(TreeNode node , int[] dia){
        if(node==null) return 0 ;
      
      int lh = diam(node.left, dia);
      int rh = diam(node.right , dia);
          dia[0]= Math.max(dia[0] , lh+rh);
      return  Math.max(lh,rh)  +1 ;
    }
}