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
        return  preorderTraversal(root,result);
    }

    public List<Integer> preorderTraversal(TreeNode root ,List<Integer> list) {
        if (root == null){
            return list;
        }
        list.add(root.val);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);

        return list;
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
