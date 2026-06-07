import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LL{
    public Node head = null;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void reverse(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public int size(){
        if(head == null){
            // System.out.println("EMoty");
            return -1;
        }

        Node temp = head;
        int count = 0;

        while(temp != null){
            temp =temp.next;
            count++;
        }

        return count;
    }

    public Node middleNode(Node head){
        int middle = size() / 2 ;

        Node temp = head;

        for(int i = 0 ; i < middle ; i++){
            temp = temp.next;
        }

        return temp;

    }

    public void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

    public static Node merge(Node head1 , Node head2){
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }

        if(head1.data < head2.data){
            head1.next = merge(head1.next, head2);
            return head1;
        }else{
            head2.next = merge(head1, head2.next);
            return head2;
        }
        
    }

    public void removeDuplicate(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        while(curr != null){
            Node runner = curr;
            while(runner.next != null){
                if(runner.next.data == curr.data){
                    runner.next = runner.next.next;
                }else{
                    runner = runner.next;
                }
            }
            curr = curr.next;
        }
    }
    public void sort(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        while(curr != null){
            Node next = curr.next;

            while(next != null){
                if(curr.data > next.data){
                    int temp = curr.data;
                    curr.data = next.data;
                    next.data = temp;
                }
                next = next.next;
            }
            curr = curr.next;
        }
    }

    public void split(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        int middle = size() / 2;
        Node curr = head;
        for(int i = 0 ; i < middle - 1 ;i++){
            curr = curr.next;
        }
        Node head2 = curr.next;
        curr.next = null;
        Node curr2 = head2;
        while(curr2 != null){
            System.out.print(curr2.data + "-->");
            curr2 = curr2.next;
        }
        System.out.println("NULL");

    }

}
public class ReverseLL {

    public static void main(String[] args) {
        LL ll = new LL();
        LL ll2 = new LL();

        ll.addFirst(5);
        ll.addFirst(3);
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addFirst(7);
        ll.addFirst(9);




        ll2.addFirst(6);
        ll2.addFirst(2);

        ll2.addFirst(3);
        
        ll2.addFirst(2);

        ll2.removeDuplicate();

        ll2.display();

        ll.sort();

        ll.display();


        // ll.display();

        // ll2.display();

        // Node ans = LL.merge(ll.head , ll2.head);

        // while(ans != null){
        //     System.out.print(ans.data + " --> ");
        //     ans = ans.next;
        // }

        // System.out.println(ll.middleNode(ll.head).data);

        ll.split();

        ll.display();
    }

}