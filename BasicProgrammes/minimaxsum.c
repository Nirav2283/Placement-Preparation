#include<stdio.h>

void main(){
    int arr[5]={1,2,3,4,5};

    int min = arr[0];
    int max = arr[0];
    int sum = 0;

    for(int i=0;i<5;i++){
         sum += arr[i];

        if(arr[i] < min){
            min = arr[i];
        }

        if(arr[i] > max){
            max = arr[i];
        }
    }

    int minsum = sum - max;
    int maxsum = sum - min;

    printf("%d %d" , minsum , maxsum);
}