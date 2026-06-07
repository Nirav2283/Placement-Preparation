#include<stdio.h>
#include<stdbool.h>

bool isAscending(int arr[] , int i , int n){
    if(i == n - 1){
        return true;
    }
    if(arr[i] > arr[i + 1]){
        return false;
    }
    return isAscending(arr , i + 1 , n);
}
void main(){
    int arr[] = {1,2,3,4,5};
    int n = sizeof(arr) / sizeof(arr[0]);
    // printf("%d" , sizeof(arr[0]));
    if(isAscending(arr , 0 , n)){
        printf("True");
    }else{
        printf("False");
    }
}