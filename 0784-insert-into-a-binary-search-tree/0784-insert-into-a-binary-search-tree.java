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
    public TreeNode insertIntoBST(TreeNode n, int val) {
        TreeNode newNode = new TreeNode(val);
        
        if(n==null)
        {
            return new TreeNode(val);
        }
        
        if (val < n.val) 
        {
            n.left = insertIntoBST(n.left,val);
        } 
        else  
        {
            n.right = insertIntoBST(n.right,val);
        }
        return n;
    }
}