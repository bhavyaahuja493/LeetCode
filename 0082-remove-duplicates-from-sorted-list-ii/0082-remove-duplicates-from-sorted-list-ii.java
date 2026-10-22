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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode curr = head;
        while(curr.next!= null && curr.val ==curr.next.val) {
            curr=curr.next;
        }
        if (curr!=head) {
            return deleteDuplicates(curr.next);
        }
        head.next = deleteDuplicates(head.next);
        return head;
    }
}
