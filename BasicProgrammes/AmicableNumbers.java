public class AmicableNumbers {

    // function to find sum of proper divisors
    static int sumOfDivisors(int n) {
        int sum = 1;

        for(int i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {220, 284, 1184, 1210, 10, 20};

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                int a = arr[i];
                int b = arr[j];

                if(sumOfDivisors(a) == b &&
                   sumOfDivisors(b) == a) {

                    System.out.println(a + " " + b);
                }
            }
        }
    }
}