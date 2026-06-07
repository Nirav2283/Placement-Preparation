#include<stdio.h>

void main(){
    int arr[5] = {1,2,3,4,5};
    //output : 2,3,4,5,1;
    int shift = 2;
    for(int i = 0 ; i < shift ; i++){
        int first = arr[0];
        for(int j = 0; j < 5 - 1 ; j++){
            arr[j] = arr[j + 1]; //shifting
        }
        arr[5 - 1] = first;
    }

    for(int i = 0 ; i < 5 ; i++){
        printf("%d," ,arr[i]);
    }
}