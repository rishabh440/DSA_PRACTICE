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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer , Integer> map = new HashMap<Integer , Integer>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i] , i);
        }
            TreeNode root = func(inorder , 0 , inorder.length -1, postorder ,0, postorder.length -1 , map);
       
        return root;
    }
TreeNode func(int[] inorder , int instart ,int inend , int[] postorder , int pstart ,int  pend ,  Map<Integer,Integer> map){
        if(instart> inend || pstart>pend)return null;
        TreeNode root = new TreeNode(postorder[pend]);
        
        int inroot = map.get(root.val);
        int numsleft= inroot - instart;
        
        root.left= func(inorder , instart , inroot-1 , postorder  , pstart , pstart +  numsleft -1, map);
        root.right = func(inorder , inroot+1 , inend , postorder , pstart  + numsleft , pend -1 , map);
        return root;
    }
}