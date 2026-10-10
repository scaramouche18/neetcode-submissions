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
            int[] nums =new int[1];
            height(root,nums);
            return nums[0];
        }
        public int height(TreeNode node,int[] nums) {
            if(node == null){
                return 0;
            }
            int leftmax= height(node.left ,nums);
            int rightmax = height(node.right,nums);
            nums[0] = Math.max(nums[0] , leftmax+rightmax);
            return Math.max(leftmax,rightmax)+1;
        }
}
