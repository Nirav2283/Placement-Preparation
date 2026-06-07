import java.util.*;

public class MergeArraySorted {

    public static void main(String[] args) {

        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};

        int[] result = new int[arr1.length + arr2.length];

        int i = 0, j = 0;

        for(int k = 0; k < result.length; k++) {

            if(i >= arr1.length) {
                result[k] = arr2[j++];
            }

            else if(j >= arr2.length) {
                result[k] = arr1[i++];
            }

            else if(arr1[i] < arr2[j]) {
                result[k] = arr1[i++];
            }

            else {
                result[k] = arr2[j++];
            }
        }

        for(int n : result) {
            System.out.print(n + " ");
        }
    }
}