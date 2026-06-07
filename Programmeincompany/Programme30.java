import java.util.*;

public class Programme30 {

    public static void main(String[] args) {
        System.out.println("Enter the number that you want twice:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 99999 ; i >= 10000 ;i--){
            //prime check
            boolean isPrime = true;
            for(int j = 2 ; j <= i / 2 ; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
                
            }
            int temp = i;
            int count = 0;

            while(temp > 0){
                if(temp % 10 == num){
                    count++;
                }
                temp /= 10;
            }

            if(isPrime && count == 2){
                System.out.println("Input: "+num);
                System.out.println("Output: "+i);
                break;
            }

        }
        
    }
}