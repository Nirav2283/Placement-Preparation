import java.util.*;

public class Prac {

    public static void main(String[] args) {

        String s = "a#b*cd";

        Character[] ans = new Character[256];

        int index = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(Character.isLetter(s.charAt(i))) {
                ans[index++] = s.charAt(i);
            }
        }

        int j = 0;

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {

            if(Character.isLetter(s.charAt(i))) {
                result.append(ans[j++]);
            }
            else {
                result.append(s.charAt(i));
            }
        }

        System.out.println(result);
    }
}