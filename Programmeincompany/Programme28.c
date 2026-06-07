// Rearrange Array Alternately 
 
// Given an array of even length, rearrange the elements such that: 
// • Elements from the first half and second half are placed alternately. 
// • The first element comes from the first half, the next from the second half, and so on. 
//  Input: [1, 2, 3, 4, 5, 6] 
// Output: [1, 4, 2, 5, 3, 6] 
 
// Input: [10, 20, 30, 40] 
// Output: [10, 30, 20, 40] 

#include<stdio.h>

// void main(){
//     int arr[4] = {10,20,30,40};

//     int result[4];

//     int mid = 2; //n/2
//     int j=0;
//     for(int i=0;i<mid;i++){
//         result[j] = arr[i];
//         result[j+1] = arr[mid+i];
//         j = j+2; 
//     }

//     for(int i=0;i<4;i++){
//         printf("%d,",result[i]);
//     }

// }

void main(){
    int arr[6] = {1, 2, 3, 4, 5, 6};
    int result[6];

    int mid = 3 ;
    int start = 0;
    for(int i=0;i<6;i++){
        if(i % 2 == 0){
            result[i] = arr[start];
            start++;
        }else{
            result[i] = arr[mid];
            mid++;
        }
    }

    for(int i=0;i<6;i++){
        printf("%d,",result[i]);
   }
}