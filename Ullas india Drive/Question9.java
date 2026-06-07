import java.util.*;

public class Question9 {

    public static int longestSubstring(String str){

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        for(int i=0; i < str.length(); i++){

            while(set.contains(str.charAt(i))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(i));
            max = Math.max(max, i-left+1);
        }
        return max;
    }

    public static void main(String[] args) {

        String str = "pwwkew";

        System.out.println("Max Length : "  + longestSubstring(str));
    }
}