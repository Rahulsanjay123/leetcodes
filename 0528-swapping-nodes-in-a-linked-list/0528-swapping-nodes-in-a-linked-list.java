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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        ListNode front = head;
        ListNode end = head;

        for(int i = 1; i < k; i++)
        {
            front = front.next;
        }

        ListNode tmp = front;
        while(tmp.next != null)
        {
            end = end.next;
            tmp = tmp.next;
        }

        int tm = front.val;
        front.val = end.val;
        end.val = tm;

        return head;
    }
}