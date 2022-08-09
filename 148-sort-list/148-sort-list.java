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
    public ListNode sortList(ListNode head) {
        ListNode node = head;
        int cur=0;
        while(node!=null){
            node= node.next;
            cur++;
        }
//         cur is the length of linkedlist
        ListNode and= head;
        int[] ans = new int[cur]; // puting all values in ans;
        for(int i=0; i<cur; i++){
            ans[i]= and.val;
            and= and.next;
        }
        Arrays.sort(ans);  // simpily sorting it
        ListNode node1= head; // updating the linked list
        for(int i=0; i<cur; i++){
            node1.val= ans[i];
            node1= node1.next;
        }
        return head;
    }
}