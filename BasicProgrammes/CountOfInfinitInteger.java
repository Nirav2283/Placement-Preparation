// Given an integer n, return the nth digit of the infinite integer sequence [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, …]. 
// Input: n = 11 => Output: 0 
// Explanation: The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the 
// number 10. 

public class CountOfInfinitInteger{
    public static void main(String[] args) {
        int n = 15;
        int count =0;
        for(int i = 1 ; ;i++){
            String s = i+"";
            // System.out.println(s);
            for(int j=0;j<s.length();j++){
                count++;
                if(count == n){
                    System.out.println(s.charAt(j));
                    return;
                }
            }

        }
    }
}