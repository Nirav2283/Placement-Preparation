import java.util.*;

public class TrappingWater {

    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        int ans = 0;
        int left = 0;
        int right = arr.length - 1;
        int lmax = 0 , rmax = 0;
        while(left < right){
            lmax = Math.max(lmax, arr[left]);
            rmax = Math.max(rmax, arr[right]);

            if(lmax < rmax){
                ans += lmax - arr[left];
                left++;
            }else{
                ans += rmax - arr[right];
                right--;
            }

        }
        System.out.println(ans);
        
    }
}