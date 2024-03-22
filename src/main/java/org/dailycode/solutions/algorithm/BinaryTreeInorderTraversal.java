package org.dailycode.solutions.algorithm;

import org.dailycode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        return result;
    }

    private void inorderTraversal(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left, values);
        values.add(node.val);
        inorderTraversal(node.right, values);
    }
}
