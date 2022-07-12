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
    public boolean findTarget(TreeNode root, int k) {
       
        ArrayList<Integer> ans = new ArrayList<>();
        func(root , ans);
        int low=0;
        int high = ans.size()-1;
        
       while(low<high){
           if(k < (ans.get(low) + ans.get(high))){
               high--;
           } 
            else if(k>(ans.get(low) + ans.get(high))){
                low++;
            }
            else return true;
        }
        return false;
    }
   void func(TreeNode root, ArrayList<Integer> ans){
        if(root==null)return ;
        
        func(root.left ,ans);
        ans.add(root.val);
        func(root.right , ans);
        
    }
}