package com.binaryTree;

public class SameTree {

    public static void main(String args[]) {

        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        tree1.root = new TreeNode(1);

        tree1.root.left = new TreeNode(2);

        tree1.root.right = new TreeNode(3);

        tree2.root = new TreeNode(1);

        tree2.root.right = new TreeNode(2);



        System.out.println(isSameTree(tree1.root,tree2.root));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        return isNodeSame(p,q);
    }

    public static boolean isNodeSame(TreeNode first, TreeNode second){

        if (first == null && second == null) return true;
        if (first == null || second == null) return false;

        boolean isSymmetric = false;

        if(first.val == second.val) {
            isSymmetric = isNodeSame(first.left, second.left) && isNodeSame(first.right, second.right);

        }

        return isSymmetric;

    }

}
