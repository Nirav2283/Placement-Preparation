import java.util.*;
import java.math.BigInteger;

public class Programme57 {

    public static void generateLargeNumber(int d , int n){
        if(d < 0 || d > 9){
            System.out.println("Please enter valid D");
        }
        if(n <= 1 || n > 1000){
            System.out.println("Please enter valid N");
        }

        String basestring = d + "000000000";
        
        BigInteger sum = BigInteger.ZERO;
        for(int i = 1 ; i <= n ; i++){
            String str = String.valueOf(i);
            int len = str.length();

            System.out.println(str);

            String newNum = basestring.substring(0, basestring.length() - len) + str;

            BigInteger newNumint = new BigInteger(newNum);
            sum = sum.add(newNumint);
            // System.out.println(newNumint);
        }
 
         System.out.println(sum);

        
    }
    public static void main(String[] args) {
        generateLargeNumber(5, 50);
    }
}