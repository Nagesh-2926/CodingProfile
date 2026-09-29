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
    Map<String,Integer> cnt=new HashMap<>();
    List<TreeNode> ans=new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        findDuplies(root);
        return ans;
    }
    String findDuplies(TreeNode node){
        if(node==null) return "null";
        String left=findDuplies(node.left);
        String right=findDuplies(node.right);
        String desc=node.val+","+left+","+right;
        cnt.put(desc,cnt.getOrDefault(desc,0)+1);
        if(cnt.get(desc)==2) ans.add(node);
        return desc;
    }
}