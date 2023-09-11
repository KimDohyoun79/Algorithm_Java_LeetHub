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

    // 결과값 저장 변수 선언
    List<Double> list = new ArrayList<>();

    public List<Double> averageOfLevels(TreeNode root) {
         bfs(root);
         return list;
    }

    // BFS 탐색
    public void bfs(TreeNode root){

        // root가 null인 경우 예외처리
        if(root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            int len = queue.size();
            double sum = 0;
            for(int i = 0; i < len; i++ ){
                TreeNode node = queue.poll();
                
                sum += node.val;

                if (node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
            list.add(sum/len);
        }
    }
}