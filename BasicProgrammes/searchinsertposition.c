#include<stdio.h>

void main(){
    int n=4;
    int arr[] = {1,3,5,6};
    int target = 2;
    for(int i=0;i<4;i++){
        if(arr[i] >= target){
            printf("%d",i);
            break;
        }
    }
    printf("%d",n);
}