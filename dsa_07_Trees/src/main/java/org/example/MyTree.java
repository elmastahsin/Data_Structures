package org.example;

import java.util.LinkedList;
import java.util.Queue;

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
                    return;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    return;
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

    void levelOrderTraversal() {
        if (root == null) return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TNode toVisit = queue.poll();
            System.out.print(toVisit.value + "  ");
            if (toVisit.leftChild != null) {
                queue.add(toVisit.leftChild);
            }
            if (toVisit.rightChild != null) {
                queue.add(toVisit.rightChild);
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        TNode current = root;

        while ((current != null)) {

            if (value < current.value) current = current.leftChild;
            else if (value > current.value) current = current.rightChild;
            else return true;
        }
        return false;
    }

    public boolean isLeaf(TNode node) {
        return node.leftChild == null && node.rightChild == null;
    }

    public void printLeaves(TNode root) {
        if (root == null) return;
        if (isLeaf(root)) System.out.print(root.value + " ");
        printLeaves(root.leftChild);
        printLeaves(root.rightChild);
    }

    public int countLeaves(TNode root) {
        if (root == null) return 0;
        if (isLeaf(root)) return 1;
        return countLeaves(root.leftChild) + countLeaves(root.rightChild);


    }

    public int findSumOfLeaves(TNode root) {
        if (root == null) return 0;
        if (isLeaf(root)) return root.value;
        return findSumOfLeaves(root.leftChild) + findSumOfLeaves(root.rightChild);
    }

    int height(TNode root) {
        if (root == null) return -1;
        if (isLeaf(root)) return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public int calculateNodeDepthSums() {
        return sumOfNodesDepth(root, 0);
    }

    // Assignment Sum of Nodes Depth
    int sumOfNodesDepth(TNode node, int A) {
        if (node == null) return 0;
        return A + sumOfNodesDepth(node.leftChild, A + 1) + sumOfNodesDepth(node.rightChild, A + 1);
    }
    int sumOfNodes(TNode node, int sum    ) {
        if (node == null) return 0;
        return sum + sumOfNodes(node.leftChild, node.value) + sumOfNodes(node.rightChild, node.value);
    }
    public int calculateNodeSums() {
        return sumOfNodes(root, root.value);
    }

    void delete(TNode root) {
        // case 1 no child


        // case 2 one child


        // case 2 two children


    }


}

