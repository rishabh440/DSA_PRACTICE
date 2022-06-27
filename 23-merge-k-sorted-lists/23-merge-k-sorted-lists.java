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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0)return null;
      ArrayList<Integer> minheap = new ArrayList<>();
      ListNode head = new ListNode(0);
        ListNode temp = head;
      for(ListNode l:lists) {
          while(l!=null){
            minheap.add(l.val);
              l=l.next;
          }
      }
       
      Collections.sort(minheap)     ; 
 for(int val : minheap){
           
            temp.next= new ListNode(val);
            temp= temp.next;
    
            
        }
        return head.next;
    }
}