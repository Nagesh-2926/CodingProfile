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
    public int goodNodes(TreeNode root) {
        return check(root,Integer.MIN_VALUE);
    }
    private int check(TreeNode node,int max){
        if(node==null) return 0;
        int cnt=0;
        if(node.val>=max) cnt=1;
        max=Math.max(max,node.val);
        cnt=cnt+check(node.left,max);
        cnt=cnt+check(node.right,max);
        return cnt;
    }
}