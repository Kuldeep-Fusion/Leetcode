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
    public TreeNode searchBST(TreeNode root, int val) {
     if(root == null) return null;
        TreeNode temp = root;
        if(root.val == val) return temp;
     if(root.val<val){
            root.right= searchBST(root.right, val);
            temp = root.right;
        }
        else if(root.val>val){
            root.left= searchBST(root.left, val);
            temp= root.left;
        }
        return temp;
    }
}