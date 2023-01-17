package org.example;

public class TreeApp {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        int[] numbers = new int[]{10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int i = 0; i < 11; i++) {
            tree.insert(numbers[i]);
        }
        tree.insert(7);

        VisualizeTree.printTree(tree.root, null, false);


        System.out.println("PreOrder Traversal :");
        tree.preOrderTraversal(tree.root);
        System.out.println();
        System.out.println("In Order Traversal :");
        tree.inOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Post Order Traversal: ");
        tree.postOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Level Order Traversal: ");
        tree.levelOrderTraversal();
        System.out.println();
        System.out.println("is contains 8 " + tree.contains(8));
        tree.printLeaves(tree.root);

        System.out.println();

        System.out.println("Number of leaves:  " + tree.countLeaves(tree.root));
        tree.printLeaves(tree.root);
        System.out.println();
        System.out.println("Sum of Leaf Nodes: " + tree.findSumOfLeaves(tree.root));
        System.out.println("Height of the tree is: " + tree.height(tree.root));
//        // System.out.println("Sum of Node Depths is: " + tree.calculateNodeDepthSums());
//        System.out.println("Sum of all node values is: " + tree.calculateNodeSums());

    }
}
