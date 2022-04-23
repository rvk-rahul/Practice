package practice.tree;

import practice.util.TreeNode;

public class SymmetricTree {

    boolean isTreeSymmetric(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null)
            return true;

        if (root1 == null || root2 == null)
            return false;

        return root1.val == root2.val && isTreeSymmetric(root1.left, root2.right) && isTreeSymmetric(root1.right, root2.left);

    }

    public SymmetricTree() {

        TreeNode root = getSymmetricTree();

        System.out.println(isTreeSymmetric(root, root));

        root = getAsymmetricTree();

        System.out.println(isTreeSymmetric(root, root));
    }

    TreeNode getSymmetricTree() {

        /*
            4
           / \
          2   2
         /\   /\
        1  3 3  1
        */
        TreeNode root = new TreeNode(4);

        TreeNode node1 = new TreeNode(2);
        root.left = node1;
        TreeNode node2 = new TreeNode(2);
        root.right = node2;

        TreeNode node3 = new TreeNode(1);
        node1.left = node3;
        TreeNode node4 = new TreeNode(3);
        node1.right = node4;

        TreeNode node5 = new TreeNode(3);
        node2.left = node5;
        TreeNode node6 = new TreeNode(1);
        node2.right = node6;

        return root;
    }

    TreeNode getAsymmetricTree() {
        /*
            4
           / \
          2   2
         /\   /\
        1  3 3  1
     */
        TreeNode root = new TreeNode(4);

        TreeNode node1 = new TreeNode(2);
        root.left = node1;
        TreeNode node2 = new TreeNode(7);
        root.right = node2;

        TreeNode node3 = new TreeNode(1);
        node1.left = node3;
        TreeNode node4 = new TreeNode(3);
        node1.right = node4;

        TreeNode node5 = new TreeNode(6);
        node2.left = node5;
        TreeNode node6 = new TreeNode(9);
        node2.right = node6;

        return root;
    }
}
