import java.util.*;

public class MyAtoi {

    public static int myAtoi(String s){
        s = s.trim();

        if(s.length() == 0){
            return 0;
        }

        boolean negative = false;
        long num = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(i == 0 && ch == '-'){
                negative = true;
            }

            else if(i == 0 && ch == '+'){
                continue;
            }

            else if(ch >= '0' && ch <= '9'){
                num = num * 10 + (ch - '0');
            }

            else{
                break;
            }
        }

        if(negative){
            num = -num;
        }

        if(num > Integer.MAX_VALUE){
            num = Integer.MAX_VALUE;
        }

        if(num < Integer.MIN_VALUE){
            num = Integer.MIN_VALUE;
        }

        return (int)num;
    } 

    public static void main(String[] args) {
        String s = "words and 987";
        System.out.println(myAtoi(s));
    }
}