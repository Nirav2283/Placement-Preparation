import java.util.*;

public class Question5 {

    public static void main(String[] args) {
        int[] arr = {4,5,2,25};
        int[] ans = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++){
            ans[i] = -1;
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] < arr[j]){
                    ans[i] = arr[j];
                    break;
                }
            }
        }

        for(int n : ans){
            System.out.print(n  + " ");
        }
    }
}