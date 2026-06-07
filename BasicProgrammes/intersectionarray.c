#include<stdio.h>

void main(){
    int arr[5] = {1, 2, 1, 3, 1};
    int arr2[5] = {3, 1, 3, 4, 2};

    for(int i = 0 ; i < 5 ; i++){
        int found = 0;
        for(int k = 0 ; k < i ; k++){
            if(arr[i] == arr[k]){
                found = 1;
                break;
            }
        }

        if(found == 1){
            continue;
        }


        for(int j = 0 ; j < 5 ; j++){
            if(arr[i] == arr2[j]){
                printf("%d," , arr[i]);
                break;
            }
        }
    }
}