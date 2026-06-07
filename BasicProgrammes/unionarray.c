#include<stdio.h>

void main(){
    int arr[4] = {1,2,3,4};
    int arr2[4] = {3,4,5,6};
    int final[50];
    int size = 0;

    //badha elements final array ma put krya
    for(int i = 0 ; i < 4 ; i++){
        final[size++] = arr[i];
    }
    //je common no hoi eva element arr2 mathi final ma add krya so we get union array
    for(int i = 0 ; i < 4 ; i++){
        int found = 0;
        for(int j = 0 ; j < size ; j++){
            if(arr2[i] == final[j]){
                found = 1;
                break;
            }
        }
        if(found == 0){
            final[size++] = arr2[i];
        }
    }

    for(int i = 0 ; i < size ; i++){
        printf("%d," , final[i]);
    }
}