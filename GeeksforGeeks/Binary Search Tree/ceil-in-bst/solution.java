/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
} */

class Solution {
    int findCeil(Node root, int k) {
        // code here
        int ans=Integer.MAX_VALUE;
        while(root!=null){
            if(root.data==k) return k;
            else if(root.data>k){
                ans=root.data;
                root=root.left;
            }else{
                root=root.right;
            }
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}