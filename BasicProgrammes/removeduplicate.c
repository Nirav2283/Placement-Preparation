#include<stdio.h>
// this code remove only ocurrnece of duplicate not numbers 
void main(){
    int arr[10] = {1,1,2,3,4,4,5,5,6,5};
    int temp[10];
    int size = 0;
    for(int i = 0 ; i < 10 ; i++){
        int found = 0;
        for(int j = 0 ; j < size ; j++){
            if(arr[i] == temp[j]){
                found = 1;
                break;
            }
        }
        if(found == 0){
            temp[size] = arr[i];
            size++;
        }
    }

    for(int i = 0 ; i < size ; i++){
        printf("%d," , temp[i]);
    }
}

// this code will remove duplicates , print only those elements that appear exactly once, in the same order.

#include<stdio.h>

// void main(){
//     int arr[12] = {7,8,20,8,9,7,2,5,6,1,3,5};

//     int n = 12;  
    

    
//     for(int i=0;i<n;i++){
//         int count = 0;
//         for(int j=0;j<n;j++){
//             if(arr[i]==arr[j]){
//                 count++;
//             }
//         }
//         if(count == 1){
//             printf("%d,",arr[i]);
//         }
//     }

// }