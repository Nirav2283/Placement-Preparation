import java.util.*;

public class LinkedListRK {

    public static boolean isPrime(int number){
        if(number <= 1){
                return false;
            }
        for(int i = 2 ; i <= number / 2 ; i++){      
            if(number % i == 0){
                return false;
            }
            
        }
        return true;
    }

    public static List<Integer> rearrange(List<Integer> group){
        List<Integer> result = new ArrayList<>();

        int start = 0;
        int end = group.size() - 1;

        for(int i = 0 ; i < group.size() ; i++){
            if(i % 2 == 0){
                result.add(group.get(start));
                start++;
            }else{
                result.add(group.get(end));
                end--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(2,3,5,7, 1,4,3,5, 4,-5,-2,-1, 1,-1,2,-2));

        int k = 4;

        LinkedList<Integer> ans = new LinkedList<>();
        for(int i = 0 ; i < list.size() ; i = i + k ){

            if(i + k > list.size()){
                break;
            }

            List<Integer> group = new ArrayList<>();
            for(int j = i ; j < i + k ; j++){
                group.add(list.get(j));
            }

            int sum = 0;
            int max = Integer.MIN_VALUE;
            int primecount = 0;
            for(int num : group){
                sum += num;
                max = Math.max(max, num);
                if(isPrime(num)){
                    primecount++;
                }
            }

            System.out.println("Group: " + group);
            System.out.println("Sum: " + sum);
            System.out.println("Max: " + max);
            System.out.println("PrimeCount: " + primecount);
            System.out.println();

            //case 1
            
            if(primecount > k / 2){
                Collections.reverse(group);
                int temp = group.get(0);
                group.set(0, group.get(group.size() - 1));
                group.set(group.size() - 1, temp);

                // System.err.println("OP rev + swap");
            }else if(sum % 2 != 0 && sum > 0){
                Collections.rotate(group, -primecount);
            }
            else if(sum % 2 == 0 && sum > 0){
                Collections.rotate(group, primecount + 1);
            }
            else if(sum == 0){
                group = rearrange(group);
            }

            // System.out.println(group);

            System.out.println("updated group: " + group);
            System.out.println();

           
            ans.addAll(group);
           
        }
          System.out.println("Final LinkedList: ");
            System.out.println(ans);
    }
}