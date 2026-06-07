#include<stdio.h>

void main(){
    int n;
    printf("Enter the size of an array: ");
    scanf("%d" , &n);
    int arr[n];
    for(int i = 0 ; i < n ; i++){
        printf("Enter an element %d: " , i + 1);
        scanf("%d" , &arr[i]);
    }

    int min , max;
    min = arr[0];
    max = arr[0];

    for(int j = 0 ; j < n ; j++){
        if(min > arr[j]){
            min = arr[j];
        }
        if(max < arr[j]){
            max = arr[j];
        }
    }
    printf("minimum element is: %d\n" , min);
    printf("maximum element is: %d\n" , max);

}