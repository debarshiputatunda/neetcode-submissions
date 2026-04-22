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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        ListNode dummy = sum;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int i = 0, j = 0;

            if(l1 != null) {
                i = l1.val;
            } 

            if(l2 != null) {
                j = l2.val;
            }

            int s = i + j + carry;
            if (s >= 10) {
                carry = 1;
                s = s % 10;
            } else {
                carry = 0;
            }

            dummy.next = new ListNode(s);
            dummy = dummy.next;
            if (l1 != null)
                l1 = l1.next;

            if (l2 != null)
                l2 = l2.next;
        }
        return sum.next;
    }
}