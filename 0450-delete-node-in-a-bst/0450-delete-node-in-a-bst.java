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
    public TreeNode deleteNode(TreeNode n, int key) {
        if (n == null) 
        {
            return null;
        }
    
        if (key < n.val) 
        {
            n.left = deleteNode(n.left, key);
        } 
        else if (key > n.val) 
        {
            n.right = deleteNode(n.right, key);
        } 
        else 
        {
            if (n.left == null && n.right == null)
            {
                return null;
            }
            
            if (n.left == null)
            {
                return n.right;
            }
            if (n.right == null)
            {
                return n.left;
            }
            
            TreeNode successor = findMin(n.right);  
            n.val = successor.val;
            n.right = deleteNode(n.right, successor.val);
        }
        return n;
    }
    
    TreeNode findMin(TreeNode node) 
    {
        while (node.left != null) 
        {
            node = node.left;
        }
        return node;
    }
}