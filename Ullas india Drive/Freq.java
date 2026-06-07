// import java.util.*;

// public class Freq {

//     public static void main(String[] args) {
//         int[] arr = {1,2,2,3,4,4,1,2,3};
//         HashMap<Integer , Integer> map = new HashMap<>();

//         for(int i = 0 ; i < arr.length ; i++){
//             map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

//         }

//         System.out.println(map);
//     }
// }

import java.util.*;

public class Freq {

    public static void main(String[] args) {
        String s = "niiravv";

        HashSet<Character> set = new HashSet<>();

        String ans = "";
        for(int i = 0 ; i < s.length() ; i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                ans += s.charAt(i);
            }
        }

        System.out.println(ans);

        
    }
}