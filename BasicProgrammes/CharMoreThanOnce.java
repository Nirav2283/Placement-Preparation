import java.util.*;

public class CharMoreThanOnce {

    public static void main(String[] args) {
        String str = "Programming";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Character key : map.keySet()){
            if(map.get(key) > 1){
                System.out.println(key);
            }
        }

        // System.out.println(map);
    }
}