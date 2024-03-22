package org.dailycode.solutions.algorithm;

import org.dailycode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderTraversal(root, result);
        return result;
    }

    private void postorderTraversal(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }

        postorderTraversal(node.left,  values);
        postorderTraversal(node.right, values);
        values.add(node.val);
    }
}
