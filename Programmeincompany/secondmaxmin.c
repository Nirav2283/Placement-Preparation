#include<stdio.h>

void main(){
    int arr[5] = {10, 5, 20, 8, 15};

    int max = arr[0];
    int min = arr[0];
    for(int i=0;i<5;i++){
        if(arr[i]>max){
            max = arr[i];
        }
        if(arr[i]<min){
            min = arr[i];
        }
    }

    int secondmax = -1 ;
    int secondmin = 10000;
    for(int i=0;i<5;i++){
        if(arr[i] > secondmax && arr[i]!=max){
            secondmax = arr[i];
        }
        if(arr[i] < secondmin && arr[i]!=min){
            secondmin = arr[i];
        }
    }
    printf("Max: %d\n",max);
    printf("Min %d\n",min);
    printf("SecondMax: %d\n",secondmax);
    printf("SecondMin: %d\n",secondmin);


}