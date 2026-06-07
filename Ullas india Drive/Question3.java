import java.util.*;

public class Question3 {

    public static boolean isPower2(int n){
        if(n <= 0){
            return false;
        }
        
        // while(n > 1){
        //     if(n % 2 != 0){
        //         return false;
        //     }
        //     n= n / 2;
        // }
        // return true;

        return ( n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPower2(n));
    }
}