import java.util.*;

public class Question10 {

    public static void main(String[] args) {
        int n = 8;
        int count = 0;
        int temp = n;
        while(temp != 0){
            int rem = temp % 2;
            if(rem == 1){
                count++;
            }
        
            temp /= 2;
        }
        System.out.println(count);
    }
}