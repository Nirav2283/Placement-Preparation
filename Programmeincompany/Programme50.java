import java.util.*;

public class Programme50 {

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};

        int maxsum = arr[0];
        int currsum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            currsum += arr[i];

            if(currsum > maxsum){
                maxsum = currsum;
            }
            if(currsum < 0){
                currsum = 0;
            }
            
        }

        System.out.println(maxsum);
    }
}