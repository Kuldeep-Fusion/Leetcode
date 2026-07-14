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
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dia;
    }
    //     if (root == null) {
    //         return 0;
    //     }
    //     int ld = diameterOfBinaryTree(root.left);
    //     int rd = diameterOfBinaryTree(root.right);
    //     int sd = ht(root.left) + ht(root.right) + 2;
    //     return Math.max(sd, Math.max(rd, ld));
    // }

    // private int ht(TreeNode node) {
    //     if (node == null) {
    //         return -1;
    //     }

    //     int left_ht = ht(node.left);
    //     int right_ht = ht(node.right);
    //     return Math.max(left_ht, right_ht) + 1;
    // }

    public DiaPair diameter(TreeNode root){
        if(root == null){
            return new DiaPair();
        }
        DiaPair ldp = diameter(root.left);
        DiaPair rdp = diameter(root.right);
        DiaPair sdp = new DiaPair();
        int sd = ldp.ht + rdp.ht + 2;
        sdp.ht=Math.max(ldp.ht, rdp.ht)+1;
        sdp.dia = Math.max(sd, Math.max(ldp.dia, rdp.dia));
        return sdp;
    }

   class DiaPair{
    int dia = 0;
    int ht = -1;

   }
}