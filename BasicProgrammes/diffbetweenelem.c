// Find the difference between the second largest element and the second smallest element of an array. 
// Input :  Enter the size of array: 7 
// Enter 7 elements: 5 1 9 7 1 5 3 
// Output: Difference: 4 

#include<stdio.h>

void main(){
    int arr[7] = {5,1,9,7,1,5,3};

    //sort the array
    for(int i = 0 ; i < 6 ; i++){
        for(int j = i + 1 ; j < 7 ; j++){
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    // for(int i = 0 ; i < 7 ;i++){
    //     printf("%d," , arr[i]);
    // }

    //remove duplicate
    int unique[7], k = 0;
    unique[k++] = arr[0];

    for(int i = 1; i < 7; i++){
        if(arr[i] != arr[i-1]){
            unique[k++] = arr[i];
        }
    }

    int secondsmallest = unique[1];
    int secondlargest = unique[k-2];

    printf("Differnece: %d" , secondlargest - secondsmallest);

    
}