import java.util.*;

// given a string that is "2a3bcd3 gh5vu8o8 hju1n3j2" 
// return true if each word has contain exactly 3 digit order doesnt matter 
// and return false if 2 digit is adjacent
public class ReturnStringSpecial {

    public static boolean checkString(String s){
        String[] words = s.split(" ");
        for(String word : words){
            int count = 0;
            for(int i= 0 ; i < word.length() ;i++){
                char ch = word.charAt(i);

                if(Character.isDigit(ch)){
                    count++;
                }

                if(i < word.length() - 1 &&Character.isDigit(word.charAt(i)) && Character.isDigit(word.charAt(i+1))){
                    return false;
                }

            }

            if(count != 3){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "2a3bcd3 gh5vu8o8 hju1n3j2";
        System.out.println(checkString(str));
        
    }
}