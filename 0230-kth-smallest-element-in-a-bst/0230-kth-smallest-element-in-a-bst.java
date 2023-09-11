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
    int re = 0;

    public int kthSmallest(TreeNode root, int k) {
        kk = k;
        inoderDfs(root);
        return re;
    }

    public void inoderDfs(TreeNode node){

        if(node == null)
            return;
            
        inoderDfs(node.left);

        count++;
        if(count == kk)
            re = node.val;
        else
            inoderDfs(node.right);

    }
}