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
    public boolean isPalindrome(ListNode head) {
        int flag=0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
       slow.next= reverse(slow.next);
        slow = slow.next;
      
        
        ListNode dummy = head;
        while(slow!=null){
            if(dummy.val==slow.val){
                dummy= dummy.next;
                slow= slow.next;
            }
            else{
                flag=1;
                break;
            }
        }
        if(flag==1)return false;
        return true;
    }
  ListNode reverse(ListNode head){
      ListNode pre = null;
      ListNode next= null;
      while(head!=null){
          next = head.next;
          head.next= pre;
          pre= head;
          head= next;
      }
      return pre;
  }
}