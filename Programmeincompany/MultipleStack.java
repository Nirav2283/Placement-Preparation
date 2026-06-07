import java.util.*;

public class MultipleStack {

    static ArrayList<Stack<Integer>> stacks = new ArrayList<>();
    int maxSize = 4;

    public static void push(int data){
        if(stacks.size() == 0 || stacks.get(stacks.size() - 1).size() == 4){
            Stack<Integer> newStack = new Stack<>();
            newStack.push(data);
            stacks.add(newStack);

            System.out.println("new stack created");
        }else{
            stacks.get(stacks.size() - 1).push(data);
        }
    }

    public static void pop(){
        if(stacks.size() == 0){
            System.out.println("Stack is empty");
            return;
        }
        Stack<Integer> lastStack = stacks.get(stacks.size() - 1);
        System.out.println("Popped: " + lastStack.pop());
        
        if(lastStack.size() == 0){
            stacks.remove(stacks.size() - 1);
        }
    }

    public static void peek(){
        if(stacks.size() == 0){
            System.out.println("Stack is empty");
            return;
        }
        Stack<Integer> lastStack = stacks.get(stacks.size() - 1);
        System.out.println("Peek: " + lastStack.peek());
       
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);

        
        System.out.println(stacks);

        pop();
        pop();
        System.out.println(stacks);
        peek();
        push(5);
        push(6);
        push(7);
        System.out.println(stacks);
        peek();

    }
}