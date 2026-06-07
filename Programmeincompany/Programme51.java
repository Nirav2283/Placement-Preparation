import java.util.*;

public class Programme51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array : ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the first array : ");
        for(int i = 0 ; i < n1 ; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements in the second array : ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2]; 
        for(int i = 0 ; i < n2 ; i++){
            arr2[i] = sc.nextInt();
        }
        int idx = 0;
        int merged[] = new int[n1 + n2];
        for(int i = 0 ; i < n1 ; i++){
            merged[idx] = arr1[i];
            idx++;
        }

        for(int i = 0 ; i < n2 ; i++){
            boolean isDuplicate = false;
            // merged[idx] = arr2[i];
            // idx++;
            for(int j = 0 ; j < idx ;j++){
                if(arr2[i] == merged[j]){
                    isDuplicate = true;
                    break;
                }
            }

            for(int j = i + 1 ; j < n2 ; j++){
                if(arr2[i] == arr2[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate){
                merged[idx] = 0;
            }else{
                merged[idx] = arr2[i];
            }

            idx++;
            
        }

        System.out.println("Merged array is : ");
        for(int i = 0 ; i < merged.length ; i++){
            System.out.print(merged[i] + " ");
        }

    }
}