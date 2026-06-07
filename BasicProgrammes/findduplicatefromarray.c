#include<stdio.h>

void main(){
    int arr[10] = {1,1,2,3,4,4,5,6,5};

    int found = 0;

    for(int i = 0 ; i < 10 ; i++){
        for(int j = i + 1 ; j < 10 ; j++){
            if(arr[i] == arr[j]){
                printf("%d,", arr[i]);
                found = 1;
                break;
            }
        }
    }

    if(found == 0){
        printf("No duplicates");
    }

}