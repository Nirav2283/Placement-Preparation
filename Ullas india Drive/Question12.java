import java.util.*;

class Node {
    int data;
    Node lptr;
    Node rptr;

    public Node(int data) {
        this.data = data;
        this.lptr = null;
        this.rptr = null;
    }
}

public class Question12 {

    public static int height(Node root) {
        if (root == null) {
            return -1;
        }
        int leftheight = height(root.lptr);
        int rightheight = height(root.rptr);

        return Math.max(leftheight, rightheight) + 1;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.lptr = new Node(2);
        root.rptr = new Node(3);

        root.lptr.lptr = new Node(4);
        root.lptr.rptr = new Node(5);
        // root.rptr = new Node(2);

        System.out.println(height(root));

    }
}