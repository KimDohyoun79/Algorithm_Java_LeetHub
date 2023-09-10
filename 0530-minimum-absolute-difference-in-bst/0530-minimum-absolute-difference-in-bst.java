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
    int min = Integer.MAX_VALUE;
    TreeNode preNode = null;
    
    public int getMinimumDifference(TreeNode root) {
        inOrderDfs(root);
        return min;
    }

    public void inOrderDfs(TreeNode node){

        if(node != null){
            inOrderDfs(node.left);

            if(preNode != null)
                min = Math.min(min, node.val - preNode.val);
            preNode = node;
            
            inOrderDfs(node.right);
        }
    }

}