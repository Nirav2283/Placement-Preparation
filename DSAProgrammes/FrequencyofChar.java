// import java.util.*;

// public class FrequencyofChar {

//     public static void main(String[] args) {
//         int[] arr = {1,2,2,3,4,4,3,2};

//         boolean[] visited = new boolean[arr.length];

//         for(int i = 0 ; i < arr.length ; i++){
//             if(visited[i] == true){
//                 continue;
//             }

//             int count = 1;

//             for(int j = i + 1 ; j < arr.length ; j++){
//                 if(arr[i] == arr[j]){
//                     count++;
//                     visited[j] = true;
//                 }
//             }

//             System.out.println(arr[i] + ":" + count);
//         }


//     }
// }

import java.util.*;

public class FrequencyofChar {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,3,2};

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0  ; i < arr.length ; i++){
            map.put(arr[i], map.getOrDefault(arr[i] , 0)+1);
        }

        System.out.println(map);
    }
}