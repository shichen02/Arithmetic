package datastructure.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tsc
 * @description: 第一天
 * @date 2022/4/1 11:52
 */
public class FirstDay {

    /**
     * 144 二叉树的前序遍历
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        return preorderTraversal(root, result);
    }

    public List<Integer> preorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        list.add(root.val);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);

        return list;
    }

    /**
     * 543 二叉树的直径
     *
     * @param root
     * @return
     */
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return getMaxValue(root);
        }
        int maxValue = getMaxValue(root);
        int leftValue = diameterOfBinaryTree(root.left);
        maxValue = Math.max(maxValue, leftValue);
        int rightValue = diameterOfBinaryTree(root.right);

        return Math.max(maxValue, rightValue);
    }

    public int getMaxValue(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        int i = diameterOfBinaryTreeLeft(root, max);
        max = Math.max(i, max);

        int j = diameterOfBinaryTreeLeft(root, max);
        max = Math.max(j, max);

        return max;
    }


    public int diameterOfBinaryTreeRight(TreeNode root, int value) {
        if (root.left == null) {
            return value;
        }
        value++;
        return diameterOfBinaryTreeRight(root.left, value);
    }

    public int diameterOfBinaryTreeLeft(TreeNode root, int value) {
        if (root.left == null) {
            return value;
        }
        value++;
        return diameterOfBinaryTreeLeft(root.right, value);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static void main(String[] args) {

    }
}
