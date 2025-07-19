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
        if(head==null||head.next==null)return head;
        int count=0;
        ListNode ptr=head;
        while(ptr!=null)
        {
            ptr=ptr.next;
            count++;
        }
        //if(count/2<k)return head;
        ListNode ptr1=head,ptr2=head;
        for(int i=0;i<k-1;i++)
        {
            ptr1=ptr1.next;
        }
        for(int i=0;i<count-k;i++)
        {
            ptr2=ptr2.next;
        }
        int t=ptr2.val;
        ptr2.val=ptr1.val;
        ptr1.val=t;
        return head;
    }
}