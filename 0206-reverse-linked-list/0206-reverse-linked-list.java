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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        // List<ListNode> refs = new ArrayList<>();
        // for (ListNode curr = head; curr != null; curr = curr.next) {
        //     refs.add(curr);
        // }
        
        // ListNode listnode = refs.get(refs.size() - 1);
        // ListNode start = listnode;

        // for(int i = refs.size() - 2 ; i >= 0 ; i--){
        //     start.next = refs.get(i);
        //     start = start.next;
        // }
        // start.next = null;
        // return listnode;

        ListNode prev = null;

        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        return prev;
    }
}