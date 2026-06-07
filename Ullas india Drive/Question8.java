// import java.util.*;

// public class Question8 {

//     public static void main(String[] args) {
//         String s1 = "listen";
//         String s2 = "silent";

//         boolean flag = false;

//         for(int i = 0 ; i < s1.length() ; i++){
//             flag = false;
//             for(int j = 0 ; j < s2.length() ; j++){
//                 if(s1.charAt(i) == s2.charAt(j)){
//                     flag = true;
//                 }
//             }
//             if(!flag){
//                 break;
//             }
//         }

//         if(flag){
//             System.out.println("True");
//         }else{
//             System.out.println("False");
//         }



//     }
// }

import java.util.*;

public class Question8 {

    public static void main(String[] args) {
        String s1 = "rat";
        String s2 = "car";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // System.out.println(arr1);
        // System.out.println(arr2);
        System.out.println(Arrays.equals(arr1 , arr2));


    }
}