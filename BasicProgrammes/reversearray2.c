#include<stdio.h>
//without new array
void main(){
    int arr[5] = {1,2,3,4,5};

    int i = 0;
    int j = 4;
    while(i < j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }

    for(int i = 0 ; i < 5 ; i++){
        printf("%d," , arr[i]);
    }
}