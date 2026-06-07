import java.util.*;

public class MoveAllZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,0,4};

        // int[] result = new int[arr.length];

        int index = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
            
        }

        for(int n : arr){
            System.out.println(n);
        }
    }
}