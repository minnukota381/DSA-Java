package LinkedList;
class CircularLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            newNode.next = head.next;
            head.next = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            newNode.next = head.next;
            head.next = newNode;
            head = newNode;  // head now points to the last node
        }
    }

    public void insertAtPosition(int data, int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(data);
        if (head == null) {
            if (position == 1) {
                head = newNode;
                head.next = head;
            } else {
                System.out.println("Position out of bounds");
            }
            return;
        }
        if (position == 1) {
            newNode.next = head.next;
            head.next = newNode;
            return;
        }
        Node temp = head.next;
        for (int i = 1; temp != head && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == head && position - 1 > 1) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (temp == head) {
            head = newNode;
        }
    }

    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            head.next = head.next.next;
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            Node temp = head.next;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = temp;
        }
    }

    public void deleteAtPosition(int position) {
        if (head == null || position < 1) {
            System.out.println("Invalid position or list is empty");
            return;
        }
        if (position == 1) {
            deleteAtBeginning();
            return;
        }
        Node temp = head.next;
        for (int i = 1; temp.next != head.next && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp.next == head.next) {
            System.out.println("Position out of bounds");
            return;
        }
        if (temp.next == head) {
            head = temp;
        }
        temp.next = temp.next.next;
    }

    public boolean search(int data) {
        if (head == null) {
            return false;
        }
        Node temp = head.next;
        do {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        } while (temp != head.next);
        return false;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head.next);
        System.out.println();
    }
}

public class LinkedListCLL {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(5);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtPosition(15, 3);

        System.out.print("Initial list: ");
        list.printList();

        list.deleteAtBeginning();
        System.out.print("After deleting at beginning: ");
        list.printList();

        list.deleteAtEnd();
        System.out.print("After deleting at end: ");
        list.printList();

        list.deleteAtPosition(2);
        System.out.print("After deleting at position 2: ");
        list.printList();

        System.out.println("Is 20 in the list? " + list.search(20));
        System.out.println("Is 25 in the list? " + list.search(25));
    }
}
