package session_8;

import java.util.List;

public class PhoneBookTree {

    CustomerNode root;

    public PhoneBookTree() {
    }

    void insert(CustomerNode newNode) {
        if (root == null) {
            root = newNode;
            return;
        }

        CustomerNode current = root;
        while (true) {
            if (newNode.firstName.compareToIgnoreCase(current.firstName) < 0) {
                //go to left
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild; // branch left

            } else {
                //go to left(greater or equal than current)
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild; // branch left
            }

        }
    }

    void printNamesInAscOrder(CustomerNode root) {
        if (root == null) return;//termination base case

        printNamesInAscOrder(root.leftChild);
        System.out.print(root.firstName + " -> ");
        printNamesInAscOrder(root.rightChild);


    }

//    List<String> firstNamesList(CustomerNode root) { // This is an In Order Traversal Iteratively
//
//    }

    // return size or number of entries in the phonebook


}
