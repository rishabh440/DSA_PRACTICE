/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        Node itr = head;
        Node front = head;
    //first step making copy node and zig zig wala position lana refer notes;  
        while(itr!=null){
             Node copy = new Node(itr.val);
            front = itr.next;
            itr.next=copy;
            copy.next= front;
            itr= front;
            
        }
  //step 2 random point karn ehai copy node ke
        
        itr = head;
        while(itr!=null){
            if(itr.random!=null){
            itr.next.random= itr.random.next;
            }
            itr= itr.next.next;
        }
        
        Node ans = new Node(0);
        Node dummy = ans;
        itr= head;
        while(itr!=null){
            dummy.next = itr.next;
            front = itr.next.next;
            itr.next = front;
            dummy= dummy.next;
            itr= front;
            
        }
        return ans.next;
    }
}