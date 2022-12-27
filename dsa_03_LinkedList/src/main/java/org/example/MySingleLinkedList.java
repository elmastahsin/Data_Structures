package org.example;

public class MySingleLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int data) {
        Node node = new Node(data);

        if (isEmpty()) {
            head = tail = node;
        } else {
        node.next= head;
        head=node;
        }
        size++;

    }

    void add(int data) {
        // create a new node object from data
        Node node = new Node(data);


        if (isEmpty()) {// if the list is empty
            head = tail = node;
        } else { // if there are elements in the list
            tail.next = node;
            tail = node;
        }
        size++;
    }


    void deleteById(int id) {
        //check if empty
        if (isEmpty()) {
            System.out.println("List is empty!!!");
        }
        Node previous = head;
        Node current = head;
        // assign prev and curremt with the head
        while (current != null) {
            if (current.id == id) {// there is a match
                // case 1 = head
                if (current == head) {
                    head = current.next;
                    current.next = null;
                }
                // case 2 = tail
                else if (current == tail) {
                    tail = previous;
                    previous.next = null;// Ex tail is eligible for garbage collection
                }
                // case 3 = middle
                else {
                    previous.next = current.next;
                    current.next = null;
                }
                // after deletion
                size--;
                // move forward on the elements of list
            }
            previous = current;
            current = current.next;
        }
    }

    int indexOf(int id) {
        if (isEmpty()) {
            return -1;
        }
        int position = 0;
        // iterate through the list
        Node current = head; // set my current with starting element

        while (current != null) {
            if (current.id == id) {
                return position;
            }
            position++;
            current = current.next;
        }
        return -1;
    }

    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.id + " => null");
            } else {
                System.out.print(current.id + " =>");

            }
            current = current.next;
        }
    }
}