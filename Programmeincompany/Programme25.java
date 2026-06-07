import java.util.*;

public class Programme25 {

    public static void main(String[] args) {
        int[] arr = {4,2,7,1};

        //sort in ascending

        for(int i = 0 ; i < arr.length - 1  ; i++){
            for(int j = 0 ; j < arr.length - i - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Ascending order");

        for(int num : arr){
            System.out.print(num + " ");
        }

        System.out.println();

        for(int i = arr.length - 2 ; i >=0  ; i--){
            for(int j = arr.length - i - 2 ; j >= 0 ; j--){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Descending order");


        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}