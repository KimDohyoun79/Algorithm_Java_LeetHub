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
    
    int count = 0;
    int kk;
    int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        kk = k;
        inoderDfs(root);
        return result;
    }

    public void inoderDfs(TreeNode node){

        if(node != null){
            inoderDfs(node.left);
            count++;
            if(count == kk)
                result = node.val;
            else
                inoderDfs(node.right);
        }
    }
}