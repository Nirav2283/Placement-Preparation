import java.util.*;

public class Programme12 {

    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};

        String[] str = new String[arr.length];

        for(int i = 0 ; i < arr.length ; i++){
            str[i] = arr[i] + "";
        }

        Arrays.sort(str, (a,b)->(b+a).compareTo(a+b));

      
        for(String s : str){
            System.out.print(s);
        }

        // System.out.println(ans);
    }
}