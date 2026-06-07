// import java.util.*;

// public class Question4 {

//     public static void main(String[] args) {
//         // int[][] arr = {{0,0,1,1} , {0,1,1,1}  , {0,0,0,1}};
//         // int[][] arr = {{0,0} , {1,1}};
//         int[][] arr = {{1,1,1},{0,0,1},{0,0,0}};

//         int rowindex = - 1;
//         int maxcount = 0;
//         int n = arr.length;
//         int m = arr[0].length;

//         for(int i = 0 ; i < n ; i++){
//             int count = 0;
//             for(int j = 0 ; j < m ; j++){
//                 if(arr[i][j] == 1){
//                     count++;
//                 }
//             }
//             if(count > maxcount){
//                 maxcount = count;
//                 rowindex = i;
//             }
//         }

//         System.out.println(rowindex);

//     }
// }

import java.util.*;

public class Question4 {

    public static int rowwithmax1(int[][] arr, int n, int m) {
        int rowindex = -1;

        int i = 0, j = m - 1;

        while (i < n && j >= 0) {
            if (arr[i][j] == 1) {
                rowindex = i;
                j--;
            } else {
                i++;
            }
        }

        return rowindex;

    }

    public static void main(String[] args) {
        int[][] arr = {
                { 0, 0, 1, 1 },
                { 0, 1, 1, 1 },
                { 0, 0, 0, 1 }
        };

        int n = arr.length;
        int m = arr[0].length;

        System.out.println(rowwithmax1(arr, n, m));
    }
}