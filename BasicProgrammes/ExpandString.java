// Write a program that should decode the given pattern and print the resulting expanded string. 
// Input: 2a3bc4dE5F2G7H 
// Output: aabbbcddddEFFFFFGGHHHHHHH
import java.util.*;

public class ExpandString {

    public static void main(String[] args) {
        String s = "a2b3c4";
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ;i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int count = ch - '0';
                char nextChar = s.charAt(i-1);
                for(int j = 0 ; j < count ; j++){
                    sb.append(nextChar);

                }
            }
        }
        System.out.println(sb.toString());
    }
}