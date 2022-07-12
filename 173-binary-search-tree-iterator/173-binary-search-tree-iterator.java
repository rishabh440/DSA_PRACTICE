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
class BSTIterator {
Stack<TreeNode> s = new Stack<>();
    
    public BSTIterator(TreeNode root) {
           pushall(root);    
    }
    
    public int next() {
        TreeNode temp = s.pop();
        pushall(temp.right);
        return temp.val;
    }
    
    public boolean hasNext() {
        return !s.isEmpty();
    }
    public void pushall(TreeNode node){
        while(node!=null){
            s.push(node);
            node=node.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */