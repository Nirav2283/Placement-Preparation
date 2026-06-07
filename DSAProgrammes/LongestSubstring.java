import java.util.*;

public class LongestSubstring {

    public static int longestSubstring(String str){

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        for(int right=0; right<str.length(); right++){

            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            max = Math.max(max, right-left+1);
        }

        return max;
    }

    public static void main(String[] args) {

        String str = "abcabcbb";

        System.out.println(longestSubstring(str));
    }
}