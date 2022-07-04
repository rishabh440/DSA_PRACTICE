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
class Pair{
    TreeNode node ;
    int num;
        Pair(TreeNode node_ , int num_){
            node = node_;
            num = num_;
        }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int ans =0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root , 0));
        while(!q.isEmpty()){
            int size= q.size();
            int min = q.size();
            int last =0 , first=0;
            for(int i=0; i<size; i++){
                int cur = q.peek().num - min;
                TreeNode node = q.poll().node;
                
                if(i==0) first = cur;
                if(i==size-1) last = cur;
                
                if(node.left!= null) q.offer(new Pair(node.left , cur*2 + 1));
                if(node.right!=null) q.offer(new Pair (node.right , cur*2 + 2));
            }
            ans = Math.max(ans , last- first + 1);
        }
        return ans;
    }
}