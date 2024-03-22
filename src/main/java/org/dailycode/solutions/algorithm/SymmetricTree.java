package org.dailycode.solutions.algorithm;

import org.dailycode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int[] levels = new int[size];
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node == null) {
                    levels[i] = Integer.MIN_VALUE;
                } else {
                    levels[i] = node.val;
                }
                if (node != null) {
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }

            for (int i = 0; i < levels.length; i++) {
                if (levels[i] != levels[levels.length - i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
