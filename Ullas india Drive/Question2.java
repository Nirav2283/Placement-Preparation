import java.util.*;

public class Question2 {

    public static void main(String[] args) {
        int[] arr = {-2,-3,-4};

        int currmax = arr[0];
        int currmin = arr[0];
        int max = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] < 0){
                int temp = currmax;
                currmax = currmin;
                currmin = temp;
            }
            currmax = Math.max(arr[i], currmax * arr[i]);
            currmin = Math.min(arr[i], currmin * arr[i]);
           
            max = Math.max(max, currmax);
        }
        System.out.println(max);
    }
}