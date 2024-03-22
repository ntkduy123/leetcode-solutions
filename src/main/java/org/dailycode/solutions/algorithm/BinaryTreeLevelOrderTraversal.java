package org.dailycode.solutions.algorithm;

import org.dailycode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levels = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levels.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            result.add(levels);
        }

        return result;
    }
}
