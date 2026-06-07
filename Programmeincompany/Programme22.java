import java.util.*;

public class Programme22 {

    public static void main(String[] args) {
        int[] arr ={1,3,2,4};

        int[] result  = new int[arr.length];
        
        for(int i = 0 ; i < arr.length ;i++){
            result[i] = -1;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] < arr[j]){
                    result[i] = arr[j];
                    break;
                }
            }
        }
        System.out.println("Next Greater Element: " + Arrays.toString(result));
    }
}