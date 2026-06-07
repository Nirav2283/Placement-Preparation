import java.util.*;

class Node {
    int data;
    Node lptr;
    Node rptr;

    Node(int data) {
        this.data = data;
        this.lptr = null;
        this.rptr = null;
    }
}

class DLL {
    public Node head = null;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.rptr = head;
        head.lptr = newNode;
        head = newNode;
        head.lptr = null;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.rptr != null) {
            curr = curr.rptr;
        }
        curr.rptr = newNode;
        newNode.lptr = curr;
        newNode.rptr = null;
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.rptr;
        }
        System.out.println("null");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        head = head.rptr;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        if (head.rptr == null) {
            head = null;
            return;
        }
        Node curr = head;

        while (curr.rptr.rptr != null) {
            curr = curr.rptr;
        }
        curr.rptr = null;

    }
}

public class Doubly {

    public static void main(String[] args) {
        DLL dll = new DLL();

        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(7);

        dll.addLast(8);

        dll.display();

        dll.deleteFirst();
        dll.display();

        dll.deleteLast();
        dll.display();

    }
}