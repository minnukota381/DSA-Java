class CircularLinkedList {
    Node last;

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
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public void insertAtPosition(int data, int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(data);
        if (last == null) {
            if (position == 1) {
                last = newNode;
                last.next = last;
            } else {
                System.out.println("Position out of bounds");
            }
            return;
        }
        if (position == 1) {
            newNode.next = last.next;
            last.next = newNode;
            return;
        }
        Node temp = last.next;
        for (int i = 1; temp != last && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == last && position - 1 > 1) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (temp == last) {
            last = newNode;
        }
    }

    public void deleteAtBeginning() {
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        if (last.next == last) {
            last = null;
        } else {
            last.next = last.next.next;
        }
    }

    public void deleteAtEnd() {
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        if (last.next == last) {
            last = null;
        } else {
            Node temp = last.next;
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp;
        }
    }

    public void deleteAtPosition(int position) {
        if (last == null || position < 1) {
            System.out.println("Invalid position or list is empty");
            return;
        }
        if (position == 1) {
            deleteAtBeginning();
            return;
        }
        Node temp = last.next;
        for (int i = 1; temp.next != last.next && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp.next == last.next) {
            System.out.println("Position out of bounds");
            return;
        }
        if (temp.next == last) {
            last = temp;
        }
        temp.next = temp.next.next;
    }

    public boolean search(int data) {
        if (last == null) {
            return false;
        }
        Node temp = last.next;
        do {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        } while (temp != last.next);
        return false;
    }

    public void printList() {
        if (last == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
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
