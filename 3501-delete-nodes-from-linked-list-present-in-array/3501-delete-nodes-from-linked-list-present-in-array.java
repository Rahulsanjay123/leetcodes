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
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Step 1: Store nums in a HashSet for O(1) lookup
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) 
        {
            set.add(num);
        }
        // Step 2: Remove matching nodes from the beginning
        while (head != null && set.contains(head.val)) 
        {
            head = head.next;
        }
        // Step 3: Traverse and remove matching nodes
        ListNode ptr = head;
        while (ptr != null && ptr.next != null) 
        {
            if (set.contains(ptr.next.val)) 
            {
                ptr.next = ptr.next.next; // Skip the node
            } 
            else 
            {
                ptr = ptr.next;
            }
        }
        return head;
    }
}