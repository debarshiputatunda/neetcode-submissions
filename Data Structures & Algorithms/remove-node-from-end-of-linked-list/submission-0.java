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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode cur = head;

        while (cur != null) {
            len++;
            cur = cur.next;
        }

        if (len == n){
            return head.next;
        }

        int c = 0;
        cur = head;

        while (cur != null) {
            if (len - c - 1 == n){
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
            c++;
        }

        return head;
    }
}
