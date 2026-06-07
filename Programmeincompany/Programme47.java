import java.util.*;

public class Programme47 {

    public static void main(String[] args) {
        String str = "geekforgeeks";
        char c = 'e';

        int count = 0;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == c){
                count++;
            }
        }

        System.out.println(count);
    }
}