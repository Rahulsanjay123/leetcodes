/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode node) {
        if (node == null) 
        {
            return true; 
        }
        int left = getHeight(node.left);
        int right = getHeight(node.right);
        if (Math.abs(left - right) > 1) 
        {
            return false;
        }
        return isBalanced(node.left) && isBalanced(node.right);
    }
    public int getHeight(TreeNode node) 
    {
        if (node == null) return -1; 
        int left = getHeight(node.left);
        int right = getHeight(node.right);
        return Math.max(left, right) + 1;
    }
}