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
    int max_depth = -1;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        rightView(root, 0, li);
        return li;
    }
    public void rightView(TreeNode root, int curr_level, List<Integer> li) {
        if(root == null) return;

        if(max_depth < curr_level){
            max_depth = curr_level;
            li.add(root.val);
        }
        rightView(root.right, curr_level+1, li);
        rightView(root.left, curr_level+1, li);
    }
}