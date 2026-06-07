// Given an array of positive integers arr[] of size n, the task is to find the second largest distinct element in 
// the array. 
// Note: If the second largest element does not exist, return -1. 
// Input: arr[] = [12, 35, 1, 10, 34, 1] 
// Output: 34 
// Explanation: The largest element of the array is 35 and the second largest element is 34. 
// Input: arr[] = [10, 10, 10] 
// Output: -1 
// Explanation: The largest element of the array is 10 there is no second largest element. 
#include<stdio.h>

void main(){
    int arr[]={12, 35, 1, 10, 34, 1};
    int largest=arr[0];
    

    for(int i=0;i<6;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
    }
    // printf("%d",largest);

    int secondlargest = -1;
    for(int i=0;i<6;i++){
        if(arr[i]<largest && arr[i]>secondlargest){
            secondlargest=arr[i];
        }
    }

    printf("%d",secondlargest);


}