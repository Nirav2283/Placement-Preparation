import java.util.*;

public class Programme40 {

    public static void main(String[] args) {
        int[] arr1 = {2,3,6,7,9};
        int[] arr2 = {1,4,8,10};

        int k = 5;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < arr1.length ; i++){
            list.add(arr1[i]);
        }

        for(int i = 0 ; i < arr2.length ; i++){
            list.add(arr2[i]);
        }

        Collections.sort(list);

        int result = list.get(k-1);

        System.out.println("element at "+k+" is: "+result);
    }
}

// import java.util.*;

// public class Programme40 {

//     public static void main(String[] args) {
//         int[] arr1 = {2,3,6,7,9};
//         int[] arr2 = {1,4,8,10};

//         int[] merge = new int[arr1.length + arr2.length];

//         int i=0,j=0;
//         for(int k = 0 ; k < 9 ; k++){
//             if(arr1[i] < arr2[j]){
//                 merge[k] = arr1[i];
//                 i++;
//             }else{
//                 merge[k] = arr2[j];
//                 j++;
//             }
//         }

//         for(int k = 0 ; k < merge.length ; k++){
//             System.out.println(merge[k]);
//         }
//     }
// }