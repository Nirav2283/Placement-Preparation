import java.util.*;

public class NextGreaterUsingStack {

    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};
        int[] ans = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for(int i = arr.length - 1 ; i >= 0 ; i--){

            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = s.peek();
            }

            s.push(arr[i]);
        }

        for(int n : ans){
            System.out.print(n + " ");
        }
    }
}