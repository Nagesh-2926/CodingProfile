/* Structure for tree and linked list
class Node {
  public int data;
  public Node left, right;

  public Node(int x) {
      data = x;
      left = right = null;
  }
};*/
class Solution {
    Node head=null;
    Node prev=null;
    public Node treeToDLL(Node root) {
        // code here
        convert(root);
        return head;
    }
    void convert(Node curr){
        if(curr==null) return;
        convert(curr.left);
        if(prev==null) head=curr;
        else{
            curr.left=prev;
            prev.right=curr;
        }
        prev=curr;
        convert(curr.right);
    }
};