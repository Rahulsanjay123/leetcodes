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
    public TreeNode searchBST(TreeNode n, int key) {
        if(n==null)
        {
            return null;
        }
        else if(key==n.val)
        {
            return n;
        }
        else if(key<n.val)
        {
            return searchBST(n.left,key);
        }
        else
        {
            return searchBST(n.right,key);
        }
    }
}