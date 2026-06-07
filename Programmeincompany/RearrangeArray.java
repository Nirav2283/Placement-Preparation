import java.util.*;

public class RearrangeArray {

    public static void main(String[] args) {
        int[] arr = { 1 , 2 , 3 ,4, 5 ,6};
        //arraange like 1,6,2,5,3,4;
        int[] result = new int[arr.length];
        int n = arr.length;

        int start = 0;
        int end = n - 1;
        for(int i = 0 ; i < arr.length ; i++){
            if(i % 2 == 0){
                result[i] = arr[start];
                start++; 
            }else{
                result[i] = arr[end];
                end--;
            }
        }

        for(int i : result){
            System.out.print(i + " ");
        }

    }
}