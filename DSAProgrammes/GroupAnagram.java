import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        HashMap<String , List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }


            map.get(key).add(word);
        }

        System.out.println(map.values());
    }
}