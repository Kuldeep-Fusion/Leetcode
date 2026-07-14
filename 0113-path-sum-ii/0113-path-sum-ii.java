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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        hashpathsum(root, targetSum, li , ans);
        return ans;
    }

    public void hashpathsum(TreeNode root, int targetSum, List<Integer> li, List<List<Integer>> ans){
         if(root == null) return;

        if(root.left == null && root.right == null){
            if( targetSum - root.val == 0){
            li.add(root.val);
            ans.add(new ArrayList<Integer>(li));
            li.remove(li.size() - 1);
            }
        }
        li.add(root.val);
        hashpathsum(root.left, targetSum - root.val, li, ans);
        hashpathsum(root.right, targetSum - root.val, li, ans);
        li.remove(li.size() - 1);
    }
    }
