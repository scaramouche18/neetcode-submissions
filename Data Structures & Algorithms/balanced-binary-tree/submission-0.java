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
     int maxDiameter;
    public boolean isBalanced(TreeNode root) {
        
            int h = height(root);
            if(h == -1)return false;
            return true;
        }
        public int height(TreeNode node){
            if(node == null){
                return 0;
            }
            int leftmax= height(node.left);
            int rightmax = height(node.right);

            if(leftmax == -1 || rightmax == -1) return -1;
            if(Math.abs(leftmax - rightmax)>1)return -1;
            return Math.max(leftmax,rightmax)+1;
            
        }
    }

