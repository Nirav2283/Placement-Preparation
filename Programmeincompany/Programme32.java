import java.util.*;

public class Programme32 {

    public static int findPivot(int[] nums){
        int totalsum = 0 ; 
        for(int num : nums){
            totalsum += num;
        }

        int leftsum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int rightsum = totalsum - leftsum - nums[i];
            if(leftsum == rightsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};

        int pivotindex = findPivot(arr);
        
        if(pivotindex >= 0){
            System.out.println(pivotindex);
        }
        else{
            System.out.println("Pivot index is not exist");
        }
    }
}