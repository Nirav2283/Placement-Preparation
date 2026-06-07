import java.util.*;

public class SumofUniqueEle {

    public static void main(String[] args) {

        int[] arr = {1,2,3,2};

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int sum = 0;

      
        for(int key : map.keySet()){

            if(map.get(key) == 1){
                sum += key;
            }
        }

        System.out.println(sum);
    }
}