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
        System.out.print(cur);
        ListNode and= head;
        int[] ans = new int[cur];
        for(int i=0; i<cur; i++){
            ans[i]= and.val;
            and= and.next;
        }
        Arrays.sort(ans);
        ListNode node1= head;
        for(int i=0; i<cur; i++){
            node1.val= ans[i];
            node1= node1.next;
        }
        return head;
    }
}