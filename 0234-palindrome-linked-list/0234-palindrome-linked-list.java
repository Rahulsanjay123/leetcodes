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
    public boolean isPalindrome(ListNode head) {
        ListNode currNode = head;
        Stack<Integer> s = new Stack<>();
        while (currNode != null) 
        {
            s.push(currNode.val);
            currNode = currNode.next;
        }
        while (head != null) 
        {
            int c = s.pop();
            if (head.val != c) 
            {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}