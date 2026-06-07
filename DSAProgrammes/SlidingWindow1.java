import java.util.*;

public class SlidingWindow1 {

    //maximum sum of subarray of size k.

    public static int maxsum(int[] arr , int k){
        int windowSum = 0;
        for(int i = 0 ; i < k ; i++){
            windowSum += arr[i];
        }
        int max = windowSum;
        for(int i = 1 ; i < arr.length - k ; i++){
            windowSum = windowSum - arr[i - 1] + arr[i + k - 1];
            max = Math.max(max, windowSum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int ans = maxsum(arr, 3);
        System.out.println(ans);


    }
}