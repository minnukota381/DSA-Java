*# DSA JAVA Repository

## Overview
This repository provides Java implementations of essential **Data Structures and Algorithms (DSA)**. Each topic is categorized for ease of navigation and includes practical examples, making it a great resource for learning and applying DSA concepts.

---

## Table of Contents
1. [Arrays](#1-arrays)
2. [Stack](#2-stack)
3. [Queue](#3-queue)
4. [Linked List](#4-linked-list)
5. [Trees](#5-trees)
6. [Graphs](#6-graphs)
7. [Searching Algorithms](#7-searching-algorithms)
8. [Sorting Algorithms](#8-sorting-algorithms)

---

## 1. Arrays
An **array** is a collection of elements stored in contiguous memory locations. It allows constant-time access to elements using an index.

### Example Code: Traversing an Array
```java
int[] arr = {1, 2, 3, 4, 5};
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

### Features:
- Fixed size.
- Efficient random access.
- Useful for implementing other data structures like stacks and queues.

---

## 2. Stack
A **stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle. 

### Operations:
- **Push**: Add an element to the top.
- **Pop**: Remove the top element.
- **Peek**: View the top element.

### Files:
- `StackInBuilt.java`: Demonstrates stack operations using Java’s `Stack` class.
- `StackUsingArray.java`: Custom stack implementation using arrays.

### Example Code: Stack Using Array
```java
class Stack {
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) throw new RuntimeException("Stack Overflow");
        arr[++top] = x;
    }

    public int pop() {
        if (top == -1) throw new RuntimeException("Stack Underflow");
        return arr[top--];
    }

    public int peek() {
        if (top == -1) throw new RuntimeException("Stack is Empty");
        return arr[top];
    }
}
```

---

## 3. Queue
A **queue** is a linear data structure that follows the **FIFO (First In, First Out)** principle.

### Operations:
- **Enqueue**: Add an element to the rear.
- **Dequeue**: Remove an element from the front.

### Files:
- `QueueInBuilt.java`: Demonstrates Java’s inbuilt `Queue` interface.
- `QueueUsingArray.java`: Custom implementation using arrays.

### Example Code: Queue Using Array
```java
class Queue {
    private int arr[], front, rear, capacity;

    Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }

    public void enqueue(int x) {
        if (rear == capacity - 1) throw new RuntimeException("Queue Overflow");
        arr[++rear] = x;
    }

    public int dequeue() {
        if (front > rear) throw new RuntimeException("Queue Underflow");
        return arr[front++];
    }
}
```

---

## 4. Linked List
A **linked list** is a dynamic data structure where elements (nodes) are linked using pointers. Types include:
- **Singly Linked List**: Each node points to the next node.
- **Doubly Linked List**: Nodes point to both the previous and next nodes.
- **Circular Linked List**: The last node points back to the first node.

### Files:
- `LinkedListSLL.java`: Singly Linked List implementation.
- `LinkedListDLL.java`: Doubly Linked List implementation.
- `LinkedListCLL.java`: Circular Linked List implementation.

### Example Code: Singly Linked List
```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
```

---

## 5. Trees
A **tree** is a hierarchical data structure where each node has a value and references to its children.

### Files:
- `BinaryTreeDemo.java`: Binary Tree implementation.
- `BinaryTreeDemo1.java`: Additional examples.

### Key Operations:
- **Traversal**:
  - Inorder (Left, Root, Right)
  - Preorder (Root, Left, Right)
  - Postorder (Left, Right, Root)

---

## 6. Graphs
A **graph** is a collection of nodes (vertices) connected by edges. This repository doesn’t include graph files currently, but you can contribute to this section!

---

## 7. Searching Algorithms
Techniques for finding elements:
- **Linear Search**: O(n) time complexity.
- **Binary Search**: O(log n) time complexity for sorted data.

### Files:
- `LinearSearch.java`
- `BinarySearch.java`

---

## 8. Sorting Algorithms

Techniques to arrange data in a specific order:

- **Bubble Sort**: Compare and swap adjacent elements.
- **Insertion Sort**: Insert elements into the correct position.
- **Selection Sort**: Select the minimum element and place it in order.

### Files:

- `BubbleSort.java`
- `InsertionSort.java`
- `SelectionSort.java`

---
