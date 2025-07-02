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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)
        {
            head=null;
            return head;
        }
        int count=0;
        ListNode ptr1 = head;
        while(ptr1!=null)
        {
            count++;
            ptr1=ptr1.next;
        }
        ListNode ptr = head;
        for(int i=1;i<(count/2);i++)
        {
            ptr=ptr.next;
        }
        ptr.next=ptr.next.next;
        return head;
    }
}