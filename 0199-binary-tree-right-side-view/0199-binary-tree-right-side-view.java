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
 
import java.util.*;

class Solution {

    List<Integer> list = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        bfs(root);
        return list;
    }

    public void bfs(TreeNode root){

        if(root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            int len = queue.size();
            while(len-- > 0 ){
                TreeNode node = queue.poll();
                
                if (len == 0)
                    list.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
            
        }
    }
}