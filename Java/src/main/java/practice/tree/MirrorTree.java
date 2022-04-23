package practice.tree;

import practice.util.TreeNode;
import practice.util.TreeUtils;

public class MirrorTree {

    void mirrorTree(TreeNode node) {

        if (node == null)
            return;

        mirrorTree(node.left);
        mirrorTree(node.right);

        TreeNode tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;
    }

    /*
            4
           / \
          2   7
         /\   /\
        1  3 6  9
     */

    public MirrorTree() {
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

        TreeUtils.printPreOrder(root);
        mirrorTree(root);
        System.out.println("\nMirror: ");
        TreeUtils.printPreOrder(root);
    }
}
