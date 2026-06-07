import java.util.*;

public class Programme6 {

    public static boolean isHarmonius(String str){

        HashSet<Character> set = new HashSet<>();

        int[] freq = new int[26];

        for(int i = 0 ; i < str.length(); i++){

            char ch = str.charAt(i);

            set.add(ch);

            freq[ch - 'a']++;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(char c : set){

            max = Math.max(max, freq[c - 'a']);
            min = Math.min(min, freq[c - 'a']);
        }

        return (max - min) <= 1;
    }

    public static void main(String[] args) {

        String s = "aaab";

        List<String> list = new ArrayList<>();

        for(int i = 0 ; i < s.length(); i++){

            for(int j = i + 1 ; j <= s.length(); j++){

                String sub = s.substring(i, j);


                if(isHarmonius(sub)){
                     
                    list.add(sub);
                }
            }
        }
        System.out.println(list);
    }
}