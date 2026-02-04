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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        postorder(ls,root);
        return ls;
    }
    public void postorder(List<Integer> ls,TreeNode node){
        if(node==null)return;
        postorder(ls,node.left);
        postorder(ls,node.right);
        ls.add(node.val);
    }
}