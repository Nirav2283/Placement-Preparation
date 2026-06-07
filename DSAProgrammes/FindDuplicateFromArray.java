import java.util.*;

public class FindDuplicateFromArray {

    public static void main(String[] args) {
        int[] arr = {1 ,2, 2, 3, 4, 4, 5};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            
        }

        // System.out.println(map);

        for(int key : map.keySet()){
            if(map.get(key) >= 2){
                System.out.print(key + " ");
            }
        }

    }
}