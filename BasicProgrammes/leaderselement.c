// A leader in array is an element which is larger than all the elements to its right side.
// arr = {16,17,4,3,5,2} , output : 2,5,17

#include<stdio.h>

void main(){
    int arr[] = {16,17,4,3,5,2};
    int n = sizeof(arr) / sizeof(arr[0]);
    // printf("%d",n);
    for(int i=n-1;i>=0;i--){
        int isLeader = 1;
        for(int j=i+1;j<n;j++){
            if(arr[i]<=arr[j]){
                isLeader=0;
                break;
            }
        }
        if(isLeader==1){
            printf("%d ",arr[i]);
        }
    }

}