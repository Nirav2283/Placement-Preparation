import java.util.*;

public class Programme35 {

    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        int sum = 0;
        for(int i = 0 ;i < k ;i++){
            sum += arr[i];
        }
        int maxSum = sum;

        for(int i = 1 ; i < arr.length - k ; i++){
            sum += arr[i - 1] - arr[i+k-1];
            if(sum > maxSum){
                maxSum = sum;
            }

        }
        System.out.println(maxSum);
    }
}