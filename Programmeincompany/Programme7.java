import java.util.*;

public class Programme7 {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";


        //1
        if(str1.length() != str2.length()){
            System.out.println("Not simqual");
            return;
        }

        //2
        int freq[] = new int[256];
        
        for(int i = 0 ; i < str1.length() ; i++){
            char ch = str1.charAt(i);
            freq[ch]++;
        }
    
        for(int i = 0 ; i < str2.length() ; i++){
            char ch = str2.charAt(i);
            freq[ch]--;
        }

        for(int i = 0; i < 256; i++){
            if(freq[i] != 0){
                System.out.println("Not Simqual");
                return;
            }
        }

        System.out.println("Simqual");

    }
}