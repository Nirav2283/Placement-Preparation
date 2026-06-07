#include<stdio.h>

void main(){
    int arr[6] = {1,2,3,4,23,24};
    int arr2[5] = {7,9,13,20,78};
    int merge[11];
    int i=0,j=0;
    for(int k=0;k<11;k++){
        if(arr[i]<arr2[j]){
            merge[k] =arr[i];
            i++;
        }else{
            merge[k] = arr2[j];
            j++;
        }
    }

    for(int k=0;k<11;k++){
        printf("%d,",merge[k]);
    }
}
