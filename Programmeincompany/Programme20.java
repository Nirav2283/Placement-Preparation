import java.util.*;

public class Programme20 {

    public static void main(String[] args) {
        int n = 9;
        boolean isPrime  = true;

        for(int i = 2 ; i < n ; i++){
            if( n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(n + " is a Prime Number");
        }else{
            System.out.println(n + " is not a Prime Number");
        }
    }
}