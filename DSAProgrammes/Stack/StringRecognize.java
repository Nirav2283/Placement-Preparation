package Stack;
import java.util.*;

public class StringRecognize {

    public static boolean recognize(String str) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        
        int i = 0;
        while (str.charAt(i) != 'c' && i < str.length()) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                return false;
            }
            stack.push(ch);
            i++;
        }
        i++;
        while(i < str.length()){
            char ch = str.charAt(i);
            if(stack.size() == 0){
                return false;
            }
            char x = stack.pop();
            if(ch == ' ' || ch != x){
                return false;
            }
            i++;
        }

        return stack.size() == 0;
    }

    

    public static void main(String[] args) {
        String str = "abcba";
        boolean result = recognize(str);
        System.out.println(result);
    }
}