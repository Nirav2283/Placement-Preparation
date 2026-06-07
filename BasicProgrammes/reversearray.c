//reverse arrray with arraay

#include<stdio.h>

void main(){
    int arr[5] = {1,2,3,4,5};
    int temp[5];

    for(int i = 0 ; i < 5 ;i++){
        temp[i] = arr[5 - i - 1];
    }

    for(int i = 0 ; i < 5 ; i++){
        printf("%d," , temp[i]);
    }
}