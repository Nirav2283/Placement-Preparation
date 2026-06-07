import java.util.*;
// Given two arrays a[] and b[], the task is to find the intersection of the two arrays. Intersection of two 
// arrays is said to be elements that are common in both arrays. The intersection should not count 
// duplicate elements and the result should contain items in any order 

public class Programme56 {

    public static void main(String[] args) {
        int a[] = { 1, 2, 1, 3, 1 };
        int b[] = { 3, 1, 3, 4, 1 };

        for (int i = 0; i < a.length; i++) {
            boolean isDupliacte = false;

            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    isDupliacte = true;
                    break;
                }
            }
            if (isDupliacte) {
                continue;
            }
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    // remove duplicate

                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}