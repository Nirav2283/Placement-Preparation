public class Programme29{
    public static void main(String[] args){
        int n = 4;
        
        int temp;
        int sum;
        while(n != 1 && n != 4){
            temp = n;
            sum = 0 ;
            while(temp != 0){
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }
            n = sum;
        }

        if(n == 1){
            System.out.println("Happy Number");
        } else {
            System.out.println("Not a Happy Number");
        }
    }
}

