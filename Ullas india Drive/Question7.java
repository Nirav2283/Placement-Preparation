import java.util.*;

public class Question7 {

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1};
        int j = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        for(int i = j ; i < arr.length ; i++){
            arr[i] = 0; 
        }
        // System.out.println(j);
        
        // System.out.println(arr[3]);

      for(int n : arr){
        System.out.print(n + " ");
      }
    }
}