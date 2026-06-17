package day25;

public class SubTree_Of_Another_Tree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Solution {

        public boolean isIdentical(TreeNode root, TreeNode subRoot) {
            if (root == null && subRoot == null) {
                return true;
            }

            if (root == null || subRoot == null) {
                return false;
            }

            if (root.val != subRoot.val) {
                return false;
            }

            return isIdentical(root.left, subRoot.left)
                    && isIdentical(root.right, subRoot.right);
        }

        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if (subRoot == null) {
                return true;
            }

            if (root == null) {
                return false;
            }

            if (root.val == subRoot.val) {
                if (isIdentical(root, subRoot)) {
                    return true;
                }
            }

            return isSubtree(root.left, subRoot)
                    || isSubtree(root.right, subRoot);
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        Solution obj = new Solution();

        System.out.println(obj.isSubtree(root, subRoot));
    }
}
