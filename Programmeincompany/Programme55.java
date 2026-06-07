import java.util.*;

public class Programme55 {

    public static void main(String[] args) {
        String str = "1+1+3+1+3+0+7+9+8+7+6+5+4+3+2+1";
        int[] arr = new int[str.length()];
        
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) != '+'){
                arr[i] = str.charAt(i) - '0';
            }
        }
        //sort
        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = 0 ; j < arr.length - i - 1 ; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                }
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                System.out.print(arr[i]);
            }
            if(i != arr.length - 1 && arr[i] != 0){
                System.out.print("+");
            }
        }
        // int[] newarr = new int[100];
        // int n = 0;
        // for(int i = 0 ; i < arr.length ; i++){
        //     if(arr[i]!=0){
        //         newarr[n++] = arr[i];
        //     }
        // }  
        // for(int i = 0 ; i < n ; i++){
        //     System.out.print(newarr[i]);
        //     if(i != n - 1){
        //         System.out.print("+");
        //     }
        // }
    }
}