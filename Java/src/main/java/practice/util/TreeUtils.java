package practice.util;

public class TreeUtils {

    public static void printPreOrder (TreeNode root) {

        System.out.print(root.val + " ");

        if(root.left == null && root.right == null) {
            return;
        }

        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public static void printInOrder (TreeNode root) {

        if (root.left != null)
            printInOrder(root.left);

        System.out.print(root.val + " ");

        if (root.right != null)
            printInOrder(root.right);

    }

    public static void printPostOrder (TreeNode root) {

        if (root.left != null)
            printPostOrder(root.left);

        if (root.right != null)
            printPostOrder(root.right);

        System.out.print(root.val + " ");
    }
}
