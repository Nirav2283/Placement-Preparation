import java.util.*;

public class Programme37 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 1};

        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){

            boolean already = false;

            for(int k = 0 ; k < i ; k++){
                if(arr[i] == arr[k]){
                    already = true;
                    break;
                }
            }
            if(already){
                continue;
            }
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        
    }
}