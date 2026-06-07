// Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose 
// sum is equal to K.  
// Input: N = 4, K = 6, arr[] = {1, 5, 7, 1} Output: 2

#include<stdio.h>
void main(){
    // int arr[4] = {1,5,7,1};
    int arr[4] = {3,2,4};
    int k = 6;
    int count=0;
    for(int i=0;i<4;i++){
        for(int j=i+1;j<4;j++){
            if(arr[i]+arr[j]==k){
                count++;
                printf("(%d,%d)\n",i,j);
            }
        }
    }
    printf("Count: %d",count);
}