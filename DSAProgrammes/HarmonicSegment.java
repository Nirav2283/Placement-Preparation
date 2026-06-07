import java.util.*;
// Condition:

// vowels == consonants
// length divisible by key
//return count of such segments
public class HarmonicSegment {

    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String s = "abcde";
        int key = 2;
        int count = 0;
        for(int i = 0 ; i < s.length() ;i++){
            int vowel  = 0  , consonant = 0;
            for(int j = i ; j < s.length();j++){
                char ch = s.charAt(j);
                if(isVowel(ch)){
                    vowel++;
                }else{
                    consonant++;
                }
                
                if(vowel == consonant && (j - i + 1) % key == 0){
                    System.out.println(s.substring(i , j + 1));
                    count++;
                }
            }
            
        }
        System.out.println(count);
    }
}