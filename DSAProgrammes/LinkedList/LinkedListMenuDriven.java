import java.util.Scanner;

class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class LL {
    public Node head = null;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.link = head;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.link != null) {
            currNode = currNode.link;
        }
        currNode.link = newNode;
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        for (int j = 1; j < position - 1; j++) {
            if (currNode == null) {
                System.out.println("Index out of bounds");
                return;
            }
            currNode = currNode.link;
        }
        if (currNode != null) {
            newNode.link = currNode.link;
            currNode.link = newNode;
        }
    }

    public void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.link;
        }
        System.out.println("NULL");

    }

    public void deleteAtfirst(){
        if (head == null) {
            System.err.println("List is empty");
        }

        head = head.link;

    }

    public void deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty");
        }

        if (head.link == null) {
            head = null;
            return;
        }

        Node currNode = head;
        while (currNode.link.link != null) {
            currNode = currNode.link;
            
        }
        currNode.link = null;

    }

    public void deleteAtposition(int position) {
        Node currNode = head;
        if (head == null) {
            System.out.println("List is empty");
        }

        if (position == 0) {
            head = head.link;
            return;
        }
        for (int i = 1; currNode != null && i < position - 1; i++) {
            currNode = currNode.link;
        }
        currNode.link = currNode.link.link;

    }

}

public class LinkedListMenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL l = new LL();

        l.addFirst(5);
        l.addLast(4);
        l.addLast(3);
        

        l.insertAtPosition(69, 2);

        l.display();

        l.deleteAtLast();
        l.display();

        

        
        
    }
}
