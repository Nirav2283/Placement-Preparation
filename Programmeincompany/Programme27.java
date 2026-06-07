import java.util.*;

public class Programme27 {

    public static void main(String[] args) {
        int[] arr = {3,5,1,7};
        int target = 8;
        int a = -1 , b = -1;

        for(int i = 0 ; i < arr.length ; i++){
           for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    a = i;
                    b = j;
                }
           }
        }
        System.out.println("[" + a + ", " + b + "]");
    }
}