package org.dailycode.solutions.algorithm;

import org.dailycode.common.TreeNode;

public class AmountOfTimeForBinaryTreeToBeInfected {

    public int amountOfTime(TreeNode root, int start) {

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (root.val == start) {
            return Math.max(leftHeight, rightHeight);
        } else {
            int findLeft = find(root.left, start);
            int findRight = find(root.right, start);

            if (findLeft == leftHeight) {
                return Math.max(leftHeight + findRight, rightHeight - findRight);
            } else {
                return Math.max(rightHeight + findLeft, leftHeight - findLeft);
            }
        }
    }

    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = height(node.left) + 1;
        int right = height(node.right) + 1;

        return Math.max(left, right);
    }

    public int find(TreeNode node, int start) {
        if (node == null) {
            return 0;
        }

        if (node.val == start) {
            return 0;
        }

        int left = height(node.left) + 1;
        int right = height(node.right) + 1;

        return Math.max(left, right);
    }
}
