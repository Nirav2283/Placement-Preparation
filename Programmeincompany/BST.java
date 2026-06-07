import java.util.*;

class Node{
    int info;
    Node left;
    Node right;

    public Node(int info){
        this.info = info;
        this.left = null;
        this.right = null;
    }
}

class Tree{
    public Node root = null;
    public Node insert(Node root , int info){
        if(root == null){
            root = new Node(info);
            return root;
        }
        Node newNode = new Node(info);
        if(root.info > newNode.info){
            root.left = insert(root.left, info);
        }else if(root.info < newNode.info){
            root.right = insert(root.right, info);
        }

        return root;
    }

    public void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.info + " ");
        inorder(root.right);
    }

    //find kth largest element in the tree
    int count = 0;
    public void Kthlargest(Node root , int k){
        if(root == null){
            return;
        }
        Kthlargest(root.right, k);

        count++;
        if(count == k){
            System.out.println(root.info);
            return;
        }

        Kthlargest(root.left, k);
        
    }
}

public class BST {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = tree.insert(tree.root , 10);
        tree.insert(tree.root , 5);
        tree.insert(tree.root , 15);

        tree.inorder(tree.root);

        tree.Kthlargest(tree.root,2);
    }
    
}