package org.dailycode.solutions.algorithm;

import org.dailycode.common.TreeNode;

public class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return dfs(root, low, high);
    }

    public int dfs(TreeNode node, int low, int high) {
        if (node == null) {
            return 0;
        }

        int val = 0;
        if (node.val >= low && node.val <= high) {
            val = node.val;
        }

        int left = 0;
        if (low < node.val) {
            left = dfs(node.left, low, high);
        }

        int right = 0;
        if (high > node.val) {
            right = dfs(node.right, low, high);
        }

        return val + left + right;
    }
}
