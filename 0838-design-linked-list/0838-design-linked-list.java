class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {
    private Node start;

    // Constructor initializes the list
    public MyLinkedList() {
        start = null;
    }

    // Get value at specific index
    public int get(int index) {
        Node ptr = start;
        int count = 0;
        while (ptr != null) {
            if (count == index) return ptr.data;
            ptr = ptr.next;
            count++;
        }
        return -1; // Index out of bounds
    }

    // Add node at the head
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = start;
        start = newNode;
    }

    // Add node at the tail
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (start == null) {
            start = newNode;
            return;
        }
        Node ptr = start;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newNode;
    }

    // Add node at a specific index
    public void addAtIndex(int index, int val) {
        if (index < 0) return;
        Node newNode = new Node(val);
        if (index == 0) {
            newNode.next = start;
            start = newNode;
            return;
        }
        Node ptr = start;
        for (int i = 0; i < index - 1; i++) {
            if (ptr == null) return;
            ptr = ptr.next;
        }
        if (ptr == null) return;
        newNode.next = ptr.next;
        ptr.next = newNode;
    }

    // Delete node at a specific index
    public void deleteAtIndex(int index) {
        if (start == null || index < 0) return;
        if (index == 0) {
            start = start.next;
            return;
        }
        Node ptr = start;
        for (int i = 0; i < index - 1; i++) {
            if (ptr.next == null) return;
            ptr = ptr.next;
        }
        if (ptr.next == null) return;
        ptr.next = ptr.next.next;
    }

    // Optional: print the current list
    public void printList() {
        Node ptr = start;
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
}