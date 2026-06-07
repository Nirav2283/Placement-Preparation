import java.util.*;
public class Programme16 {

    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
                return;
            }else{
                set.add(arr[i]);
            }
            
        }
        System.out.println("No Repeated Number Found..yooo");
    }
}