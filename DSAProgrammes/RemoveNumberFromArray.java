import java.util.*;

public class RemoveNumberFromArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int target = 3;
        int index = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != target){
                arr[index] = arr[i];
                index++;
            }
        }

        for(int i = 0 ; i < index ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}