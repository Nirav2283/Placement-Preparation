import java.util.*;

public class Programme8 {

    public static void main(String[] args) {
        int[] arr = {5,3,8,1,2};

        int max = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        int secondmax = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(secondmax < arr[i] && arr[i] != max){
                secondmax = arr[i];
            }
        }

        System.out.print(secondmax);


    }
}