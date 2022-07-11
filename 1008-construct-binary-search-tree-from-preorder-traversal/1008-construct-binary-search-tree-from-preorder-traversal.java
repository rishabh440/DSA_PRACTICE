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
    public TreeNode bstFromPreorder(int[] preorder) {
        return func(preorder , Integer.MAX_VALUE , new int[]{0});
    }
    TreeNode func(int[] preorder , int max , int[] a){
        if(a[0]==preorder.length || preorder[a[0]]>max)return null;
        
        TreeNode root = new TreeNode(preorder[a[0]++]);
     root.left =  func(preorder , root.val , a);
     root.right = func(preorder , max , a);
        return root;
    }
}