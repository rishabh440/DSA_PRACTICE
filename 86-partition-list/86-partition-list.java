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
    public ListNode partition(ListNode head, int x) {
        ListNode list1 = new ListNode();
        ListNode ans = list1;
        ListNode list2 = new ListNode();
        ListNode l2= list2;
        while(head!=null){
            if(head.val<x){
              list1.next = head;
                list1= list1.next;
            }
            else{
                list2.next= head;
                list2=list2.next;
            }
            head= head.next;
        }
        list1.next=l2.next;
        list2.next= null;
        return ans.next;
    }
}