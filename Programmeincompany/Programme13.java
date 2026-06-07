import java.util.*;

public class Programme13 {

//     Jump Game – Reach the Last Index 
 
// You are given an integer array nums where each element represents the maximum jump length from 
// that position. 
// • You start at the first index (index 0). 
// • From any index, you can jump forward up to the number of steps given by the value at that 
// index. 
// • Determine whether it is possible to reach the last index of the array. 
// The program should return: 
// • True if the last index can be reached 
// • False otherwise 
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int n = nums.length;
        int maxIndex = 0;
        for(int i = 0 ; i < n ; i++){

            if(i > maxIndex){
                System.out.println(false);
                return;
            }

            maxIndex = Math.max(maxIndex, i + nums[i]);
        }

        System.out.println(true);

    }
}