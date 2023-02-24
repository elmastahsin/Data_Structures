package session_8;

import java.util.List;

public class PhoneBookTree {

    CustomerNode root;

    public PhoneBookTree(CustomerNode root) {
        this.root = root;
    }

    void insert(CustomerNode newNode) {
        if (root == null) {
            root = newNode;
            return;
        }

        CustomerNode current=root;
        while(true){
            if (newNode.fistName.equalsIgnoreCase(current.fistName)){

            }
        }
    }

    void printNamesInAscOrder(CustomerNode root) {
    }

    List<String> firstNamesList(CustomerNode root) { // This is an In Order Traversal Iteratively

    }

    // return size or number of entries in the phonebook


}
