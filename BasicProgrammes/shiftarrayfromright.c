#include<stdio.h>

void main(){
    int arr[5] = {1,2,3,4,5};
    //output : 5,1,2,3,4;
    int shift = 1;
    for(int i = 0 ; i < shift ; i++){
        int last = arr[4];
        for(int j = 4; j > 0 ; j--){
            arr[j] = arr[j - 1];
        }
        arr[0] = last;
    }

    for(int i = 0 ; i < 5 ; i++){
        printf("%d," ,arr[i]);
    }
}