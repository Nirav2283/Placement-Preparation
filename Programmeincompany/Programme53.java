import java.util.*;

public class Programme53 {
    public static void main(String[] args) {
        String str = "nirav";

        int vowel = 0;
        int consonent  = 0;
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vowel++;
            }else{
                consonent++;
            }
        }
        System.out.println("Vowel: " + vowel);
        System.out.println("Consonant: "+ consonent);

    }
}