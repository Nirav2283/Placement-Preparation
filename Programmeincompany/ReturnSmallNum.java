import java.util.Arrays;

public class ReturnSmallNum {
    public static void main(String[] args){
        int n = 31000;

        int temp = n;

        int count  = 0;

        while(temp > 0){
           count++;
           temp /= 10;
        }

        int[] arr = new int[count];
        int i = 0;

        temp = n;
        while(temp > 0){
            int digit = temp % 10;
            temp /= 10;
            arr[i] = digit;
            i++;      
        }

        Arrays.sort(arr);

        int index = 0;
        while(arr[index] == 0){
            index++;
        }
        int t = arr[0];
        arr[0] = arr[index];
        arr[index] = t;

        for(int ele : arr){
            System.out.print(ele);
        }

    }
}
