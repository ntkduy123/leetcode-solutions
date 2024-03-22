package org.dailycode.solutions.algorithm;

import org.dailycode.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class PseudoPalindromicPathsInABinaryTree {

    private Map<Integer, Integer> map = new HashMap<>();
    private int result = 0;

    public int pseudoPalindromicPaths(TreeNode root) {
        dfs(root);
        return result;
    }

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        map.put(node.val, map.getOrDefault(node.val, 0) + 1);
        if (node.left == null && node.right == null) {
            int oddCount = 0;
            for (Integer value : map.values()) {
                if (value % 2 == 1) oddCount++;
                if (oddCount > 1) break;
            }
            if (oddCount < 2) result++;
        }
        dfs(node.left);
        dfs(node.right);
        map.put(node.val, map.get(node.val) - 1);
    }
}
