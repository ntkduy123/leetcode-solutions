package org.dailycode.solutions.algorithm;

import org.dailycode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversal(root, result);
        return result;
    }

    public void preorderTraversal(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }

        values.add(node.val);
        preorderTraversal(node.left, values);
        preorderTraversal(node.right, values);
    }
}
