/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return head;
        ListNode node = head;
        int c=1;
        while(node.next!=null){
            node= node.next;
            c++;
        }
        node.next=head;
        k= k%c;
        k= c-k;
        while(k-->0)node=node.next;
        head= node.next;
        node.next=null;
        return head;
        
    }
}