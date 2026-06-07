public class NoovosoftString {

    public static void main(String[] args) {

        String str = "apple is fruitt";

        String[] words = str.split(" ");

        for(String word : words){

            boolean repeat = false;

            for(int i = 0 ; i < word.length() ; i++){

                for(int j = i + 1 ; j < word.length() ; j++){

                    if(word.charAt(i) == word.charAt(j)){
                        repeat = true;
                        
                    }
                }
            }

            if(repeat){

                for(int i = word.length()-1 ; i >= 0 ; i--){

                    System.out.print(word.charAt(i));

                    if(i != 0){
                        System.out.print(":");
                    }
                }

                System.out.println();
            }
        }
    }
}