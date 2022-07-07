/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null||head.next == null) return null;
        
    ListNode fast = head;
    ListNode slow = head;
    ListNode entry = head;
        
    while(fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
            
        if(slow == fast) {
            fast= head;
            while(slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }
    return null;
    }
}