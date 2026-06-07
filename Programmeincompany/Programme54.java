import java.util.*;

public class Programme54 {

    public static void main(String[] args) {
        String s = "Hello JavaAndPython";
        int upper = 0;
        int lower = 0;
        for(int i = 0 ; i<s.length() ;i++){
            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                upper++;
            }else if(ch >= 'a' && ch <= 'z'){
                lower++;
            }
        }

        System.out.println("Upper case: " + upper);
        System.out.println("Lower case: " + lower);


    }
}