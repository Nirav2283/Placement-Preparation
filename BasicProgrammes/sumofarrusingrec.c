#include<stdio.h>

int sumofarr(int arr[] , int n){
    if (n == 0) return 0;
    return arr[n-1] + sumofarr(arr,n-1);
}
void main(){
    int arr[5] = {1,6,7,8,4};
    int sum = sumofarr(arr,5);
    printf("%d",sum);
}