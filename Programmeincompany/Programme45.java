import java.util.*;
public class Programme45{
    public static void main(String[] args){
        int n = 5;
        int a = 0 , b = 1 ;
        int[] fib = new int[n];
        // System.out.print(a + " " + b + " ");
        fib[0] = a;
        fib[1] = b;
        for(int i = 0 ; i < n-2 ; i++){
            int c = a+b;
            fib[i+2] = c;
            a = b;
            b = c;
        }
        for(int i = n - 1 ; i >= 0 ; i--){
            System.out.print(fib[i] + " ");
        }
    }
}