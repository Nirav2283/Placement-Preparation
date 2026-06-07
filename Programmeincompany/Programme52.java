import java.util.*;

public class Programme52 {

    public static void main(String[] args) {
        int[][] arr ={{1,2,3,4},{4,3,2,1},{7,8,9,6},{6,5,4,3}};
        int principalDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for(int i = 0 ; i < arr.length ;i++){
            for(int j = 0 ; j < arr.length ;j++){
                if(i == j){
                    principalDiagonalSum += arr[i][j];
                }else if(i+j == arr.length-1){
                    secondaryDiagonalSum += arr[i][j];
                }
            }
        }

        System.out.println("Principal Diagonal Sum: " + principalDiagonalSum);
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum);
        
    }
}   