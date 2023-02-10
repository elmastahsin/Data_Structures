package SLL_PhoneBook;

public class PhoneBook {
    Node head;
    Node tail;
    int size;

    public PhoneBook() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    void insert(String name, String lastName,
                String email, String phoneNumber) {
        Node newNode = new Node(name, email, lastName, phoneNumber);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        tail.next = null;
        size++;
    }

    int size() {
        return size;
    }

    int indexOf(String email) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.email.equals(email)) {
                return index;
            }
            current = current.next;
            index++;

        }
        return -1;

    }

    int findByName(String name) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.name.equals(name)) {
                return index;
            }
            current = current.next;
            index++;

        }
        return -1;
    }

    boolean isEmpty() {
        return head == null;
    }

    void deleteByEmail(String email) {
        if (isEmpty()) {
            System.out.println("List is Empty");
            ;
        }
        Node current = head;
        Node prev = head;
        while (current != null) {
            if (current.email.equals(email)) {
                if (current == head) {
                    head = current.next;

                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;

                }
                size--;
            }
            prev = current;
            current = current.next;
        }

    }

    void swap(Node node1, Node node2) {
        Node temp = new Node(node2.name, node2.email, node2.lastname, node2.phoneNumber);
        node2.name = node1.name;
        node2.email = node1.email;
        node2.lastname = node1.lastname;
        node2.phoneNumber = node1.phoneNumber;

        node1.name = temp.name;
        node1.email = temp.email;
        node1.lastname = temp.lastname;
        node1.phoneNumber = temp.phoneNumber;
    }

    void sortByName(){





    }
}
