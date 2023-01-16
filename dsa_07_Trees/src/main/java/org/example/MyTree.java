package org.example;

public class MyTree {
    TNode root;

    public MyTree() {
    }

    void insert(int value) {
        TNode newNode = new TNode(value);

        if (root == null) {
            root = newNode;
            return;
        }

        TNode current = root;
        while (true) {
            if (value <= current.value) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    // Pre-Order Traversal of teh tree
    // Root - Left - Right
    void preOrderTraversal(TNode root) {
        if (root == null) return;
        System.out.print(root.value + " ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    // In-Order Traversal of teh tree
    // Left - Root - Right
    void inOrderTraversal(TNode root) {
        if (root == null) return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + " ");
        inOrderTraversal(root.rightChild);

    }

    // Post-Order Traversal of teh tree
    // Left - Right - Root
    void postOrderTraversal(TNode root) {
        if (root == null) return;
        postOrderTraversal(root.leftChild);

        postOrderTraversal(root.rightChild);
        System.out.print(root.value + " ");
    }


}

