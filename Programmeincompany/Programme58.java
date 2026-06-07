import java.util.*;

public class Programme58 {

    static String[] words = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "nineteen",
            "twenty", "twenty-one", "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five",
            "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine", "thirty"
    };

    public static String convertTimeToString(int h, int m) {
        if (m == 0)
            return words[h] + " o' clock";

        if (m == 15)
            return "quarter past " + words[h];

        if (m < 30) {
            String minute = (m == 1) ? " minute" : " minutes";
            return words[m] + minute + " past " + words[h];
        }

        if (m == 30)
            return "half past " + words[h];

        if (m == 45)
            return "quarter to " + words[h + 1];

        if (m > 30) {
            int remminute = 60 - m;
            String minute = (remminute == 1) ? " minute" : " minutes";
            return words[remminute] + minute + " to " + words[h + 1];
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(convertTimeToString(343, 1));
    }
}