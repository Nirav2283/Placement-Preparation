// #include<stdio.h>

// void main(){
//     int arr[7] = {1, 1, 1, 2, 2, 2, 3};
//     int count = 0;
//     for(int i=0;i<7;i++){
//         int isUnique = 1;
//         for(int j=0;j<i;j++){
//             if(arr[i] == arr[j]){
//                 isUnique = 0;
//                 break;
//             }
//         }
//         if(isUnique){
//             count++;
//         }
//     }
//     // printf("%d",count);

//     for(int i=0;i<7;i++){
//         int checked = 0;
//         for(int j=0;j<i;j++){
//             if(arr[i] == arr[j]){
//                 checked = 1;
//                 break;
//             }
//         }
//         if(checked){
//             continue;
//         }

//         int freqcount = 0;
//         for(int j=0;j<7;j++){
//             if(arr[i] == arr[j]){
//                 freqcount++;
//             }
//         }
//         if(freqcount >= count){
//             printf("%d , ",arr[i]);
//         }
//     }
// }

import java.util.*;

public class Programme1 {

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 2, 3};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num , map.getOrDefault(num,0)+ 1);
        }

        //count unique elements
        int count = map.size();

        List<Integer> result = new ArrayList<>();

        map.forEach((key,value)->{
            if(value >= count){
                result.add(key);
            }
        });

    //    System.out.println(map);
         System.out.println(result);

    }
}