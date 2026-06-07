import java.util.*;

public class Programme49 {

    public static void main(String[] args) {
        int[] arr = { 1, 94, 93, 1000, 5, 92, 78, 0, 1, 2, 3, 4 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue; 
            }
            if (arr[i] + 1 == arr[i + 1]) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }

        max = Math.max(max, count);

        System.out.println(max + 1);

    }
}