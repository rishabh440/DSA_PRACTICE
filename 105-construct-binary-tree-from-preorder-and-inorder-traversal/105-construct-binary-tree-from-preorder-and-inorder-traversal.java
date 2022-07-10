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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer , Integer> map  = new HashMap<Integer , Integer>();
        for(int i =0 ; i<inorder.length; i++){
            map.put(inorder[i] ,i);
        }
        TreeNode root = func(preorder , 0 , preorder.length-1 , inorder , 0 ,inorder.length -1 , map);
        return root;
    }
 TreeNode func(int[] preorder ,int pstart ,int pend , int[] inorder , int instart, int inend,  Map<Integer , Integer> map){
       
        if(pstart> pend || instart> inend) return null;
         TreeNode node = new TreeNode(preorder[pstart]);
        int inroot = map.get(node.val);
        int nums = inroot - instart;
        
        node.left= func(preorder , pstart + 1, pstart + nums , inorder , instart , inroot -1, map);
        node.right =func(preorder , pstart + nums + 1,  pend , inorder , inroot +1 , inend, map);
     return node;
    }
}