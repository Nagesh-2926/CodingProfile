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
    int moves=0;
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return moves;
    }
    private int dfs(TreeNode node) {
        if(node==null) return 0;
        int lbalance=dfs(node.left);
        int rbalance=dfs(node.right);
        moves+=Math.abs(lbalance);
        moves+=Math.abs(rbalance);
        return node.val+lbalance+rbalance-1;
    }
}