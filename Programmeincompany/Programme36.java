
import java.util.*;

public class Programme36 {

    public static void main(String[] args) {
        String[] arr = {"flowers", "flow", "fly", "flight"};

        Arrays.sort(arr);

    //    for(int i = 0 ; i < arr.length ; i++){
    //         System.out.println(arr[i]);
    //     }

        // System.out.println(arr[0]);

        String first = arr[0];
        String last = arr[arr.length-1];

        int i = 0;

        while(i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)){
            i++;
        }
        System.out.println(first.substring(0, i));


    }
}