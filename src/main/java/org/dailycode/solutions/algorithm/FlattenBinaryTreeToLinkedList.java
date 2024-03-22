package org.dailycode.solutions.algorithm;

import org.dailycode.common.TreeNode;

public class FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {
        flattenDFS(root);
    }

    private TreeNode flattenDFS(TreeNode node) {
        if (node == null) {
            return null;
        }

        if (node.left == null && node.right == null) {
            return node;
        }

        TreeNode left = flattenDFS(node.left);
        TreeNode right = flattenDFS(node.right);

        if (left != null) {
            left.right = node.right;
            node.right = node.left;
            node.left = null;
        }

        return left == null ? right : left;
    }
}
