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
    long tsum=0;
    long productMax=0;
    public int maxProduct(TreeNode root) {
        tsum+=needSum(root);
        needMaxProduct(root);
        return (int)(productMax % 1000000007);
    }
    private long needSum(TreeNode node){
        if(node==null) return 0;
        return node.val+needSum(node.left)+needSum(node.right);
    }
    private long needMaxProduct(TreeNode node){
        if(node==null) return 0;
        long lsum=needMaxProduct(node.left);
        long rsum=needMaxProduct(node.right);
        long subtreeSum=node.val+lsum+rsum;
        long remSum=tsum-subtreeSum;
        long product=subtreeSum*remSum;
        productMax=Math.max(productMax,product);
        return subtreeSum;
    }
}