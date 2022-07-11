/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node black = root;
        while(black!=null && black.left!=null){
            Node node = black;
            while(true){
                node.left.next = node.right;
                if(node.next==null)break;
                node.right.next=node.next.left;
                node=node.next;
            }
            black = black.left;
        }
        return root;
        
    }
}