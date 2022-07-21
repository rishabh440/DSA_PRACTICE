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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right) return head;
        int c=0;
        ListNode dummy = new ListNode();
        
        dummy.next= head;
         ListNode pre = dummy;
        for(int i=1; i<left; i++){
            pre = pre.next;
        }
        int k = (right-left)+1;
        ListNode right1= head;
      for(int i=1 ; i<=right; i++){
          right1= right1.next;
      }
      
        ListNode cur = pre;
        ListNode next= pre;
  
        while(pre.next!=right1){
             // System.out.print(pre.val + " " + cur.val + " " +  next.val+ " ");
           
            cur = pre.next;
            next= cur.next;
            for(int i=1;i<k; i++){
                cur.next = next.next;
                next.next= pre.next;
                pre.next= next;
                next=cur.next;
            }
            
        
            pre=cur;
         
        }
        return dummy.next;
    }
} 