// input : [1,2,3] k = 100
// output : [2,2,3]

import java.util.*;

public class AddArraySum {

    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int k = 181;
        String ans = "";
        for(int i = 0 ; i < arr.length ; i++){
            ans += arr[i];
        }

        int sum = Integer.parseInt(ans) + k;
        System.out.println(sum);

        int temp = sum;
        List<Integer> list = new ArrayList<>();
        while(temp != 0){
            int rem = temp % 10;
            list.add(rem);
            temp /= 10;
        }

        Collections.reverse(list);
        System.out.println(list);
    }
}