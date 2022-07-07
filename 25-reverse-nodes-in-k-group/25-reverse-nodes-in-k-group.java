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
    public ListNode reverseKGroup(ListNode head, int k) {
       if(head==null || k==1)return head;
        ListNode node = head;
        int c=0;
        while(node!=null){
            node= node.next;
            c++;
        }
        ListNode dummy = new ListNode();
        dummy.next= head;
        ListNode pre = dummy;
        ListNode cur = pre;
        ListNode next= pre;
        while(c>=k){
            cur= pre.next;
            next= cur.next;
            for(int i=1 ;i<k ; i++){
                cur.next= next.next;
                next.next= pre.next;
                pre.next= next;
                next= cur.next;
            }
            c-=k;
            pre = cur;
        }
        return dummy.next;
    }
}