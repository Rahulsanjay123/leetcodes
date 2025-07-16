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
    TreeNode root = null;
    int pre_index=0;
    public TreeNode buildTree(int[] p, int[] i) {
        return build_helper(p,i,0,i.length-1);
    }
    public TreeNode build_helper(int[]pre, int[]in, int s, int e)
    {
        if(s>e)
        {
            return null;
        }
        int in_index=-1;
        int root_val=pre[pre_index++];
        TreeNode root = new TreeNode(root_val);
        for(int itr=s;itr<=e;itr++)
        {
            if(root_val==in[itr])
            {
                in_index=itr;
                break;
            }
        }
        root.left=build_helper(pre,in,s,in_index-1);
        root.right=build_helper(pre,in,in_index+1,e);
        return root;
    }
}