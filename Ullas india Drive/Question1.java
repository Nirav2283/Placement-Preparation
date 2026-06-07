// import java.util.*;

// public class Question1 {

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7};
//         int k = 3;

//         for(int i = 0 ; i < k ; i++){
//             int last = arr[arr.length - 1];
//             for(int j = arr.length - 1 ; j > 0 ; j--){
//                 arr[j] = arr[j - 1];
//             }
//             arr[0] = last;
//         }

//         for(int n : arr){
//             System.out.print(n + " ");
//         }
//     }

// }

// o(n) approach

import java.util.*;

public class Question1 {

    public static void reverse(int[] arr , int start ,int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        // for(int n : arr){
        //     System.out.println(n);
        // }
    }

    public static void rotate(int[] arr , int k){
        int n = arr.length;
        
        if(k > n){
            k = k % n;
        }

        reverse(arr, 0 , n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        


    }
    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};

        int k = 2;
        

        rotate(arr, k);

        for(int n : arr){
            System.out.print(n + " ");
        }
    }
}