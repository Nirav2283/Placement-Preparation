package Stack;
class Stack {
    int top;
    int max;
    int s[];

    public Stack(int size){
        top = -1;
        max = size;
        s = new int[max];
    }

    public void push(int data){
        if(top >= max - 1){
            System.out.println("stack overflow");
            return;
        }
        top++;
        s[top] = data;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        top--;
        return s[top + 1];
    }

    public int peep(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return s[top];
    }

    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i = top ; i >= 0 ; i--){
            System.out.println(s[i]);
        }
    }

    public void change(int i , int k){
        if(s[top - i + 1] <= 1){
            System.out.println("Stack underflow!!");
        }
        s[top - i + 1] = k;
    }


}

public class StackDemo{
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(5);
        s.push(6);
        s.push(6);
        s.push(9);
        // s.display();
        s.pop();
        // s.display();
        // System.out.println(s.peep());
        // s.display();
        s.change(2, 69);
        s.display();
    }
}
