#include<stdio.h>

void main(){
    int arr[6] = {1,2,3,4,5};
    // want to insert element = 10 at position = 2

    int pos = 2 , ele = 10;
    int n = 5;
    for(int i = 5 ; i >= pos ; i--){
        arr[i] = arr[i - 1];
    }
    arr[pos - 1] = ele;

    n++;
    for(int i = 0 ; i < n ;i++){
        printf("%d," , arr[i]);
    }
}