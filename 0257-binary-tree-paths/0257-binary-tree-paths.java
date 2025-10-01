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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(root, sb, result);
        return result;
    }

    private void dfs(TreeNode node, StringBuilder sb, List<String> result){
        if(node == null) return;
        
        int length = sb.length();
        sb.append(node.val);
        if(node.left == null && node.right == null){
            result.add(sb.toString());
        }else {
            sb.append("->");
        }

        dfs(node.left, sb, result);
        dfs(node.right, sb, result);

        sb.setLength(length);
    }
}