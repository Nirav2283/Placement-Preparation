#include<stdio.h>

void main(){
    int arr[5] = {4,1,9,3,7};

    int max = 0;
    for(int i = 0 ; i < 5 ; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }

    int secondmax = -1;

    for(int i=0;i<5;i++){
        if(secondmax < arr[i] && arr[i]!=max){
            secondmax = arr[i];
        }
    }

    printf("Sum is : %d" , max+secondmax);
    
}