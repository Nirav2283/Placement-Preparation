import java.util.*;
// Sentence Similarity Ranking Based on a Secret Word 

// You are given a secret code word and a list of sentences. 
// Your task is to analyse each sentence and calculate how closely it matches the secret word based on the 
// following conditions: 
// Matching Conditions 
// For each word in a sentence, compare it with the secret word: 
// 1. Length must be the same as the secret word 
// 2. Characters must match 
// 3. Positions of matching characters must be the same 
// 4. Comparison is case-insensitive 
// Each matching character at the correct position increases the similarity score by 1. 
// Overall Task 
// • Calculate the total similarity score for each sentence 
// • Store all similarity scores in an array 
// • Sort the sentences in descending order of similarity 
// • Return the final decoded string by joining sentences according to their similarity rank 
public class Programme5 {

    public static int getScore(String sentence, String secret) {
        String[] words = sentence.split(" ");
        int score = 0;

        for (String word : words) {
            if (word.length() == secret.length()) {
                for (int i = 0; i < secret.length(); i++) {
                    if (word.charAt(i) == secret.charAt(i)) {
                        score++;
                    }
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        String[] arr = { "I love my pet",
                "A car ran fast",
                "He bought a hat",
                "The cat sat on the mat" };

        String secret = "cat";

        List<String> list = new ArrayList<>();
        // System.out.println(getScore(arr[0], secret));
        // Map<String,Integer> map = new HashMap<>();
        Map<Integer, String> newmap = new TreeMap<>(Collections.reverseOrder());

        for (String s : arr) {
            int score = getScore(s, secret);
            newmap.put(score, s);
            list.add(s);
        }
        // Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        // System.out.println(newmap);

        StringBuilder result = new StringBuilder();
        newmap.forEach((key, value) -> {
            result.append(value).append(" ");
        });

        System.out.print(result);
        // System.out.println(newmap.get(7));
        // System.out.println(map.get("A car ran fast"));

        // String result = String.join(" ",list);
        // System.out.print(result);

    }
}