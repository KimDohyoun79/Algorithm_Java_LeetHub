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

    List<Integer> list; // 정렬된 val를 저장하기 위한 List

    public int getMinimumDifference(TreeNode root) {
        list = new ArrayList<>();
        
        // 중위 탐색 및 노드의 val값을 list 저장
        inOrderDfs(root);

		// 정렬된 list에서 최소 절대차 구하기
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list.size() - 1; i++){
            min = Math.min(min, list.get(i+1) - list.get(i));
        }

        return min;
    }

	// 중위 탐색 DFS
    public void inOrderDfs(TreeNode node){
        
        if(node != null){
            inOrderDfs(node.left);
            list.add(node.val);
            inOrderDfs(node.right);
        }
    }

}