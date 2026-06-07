#include<stdio.h>

void sort(int arr[] ,int n , int i){

    if(n==1) return;

    if(i == n - 1){
        sort(arr,n-1,0);
        return;
    }

    if(arr[i]>arr[i+1]){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
    return sort(arr,n,i+1);
}
void main(){
    int arr[5] = {30,10,40,20,60};
    int size = sizeof(arr)/sizeof(arr[0]);
    // printf("%d",size);

    sort(arr,size,0);
    // for(int i=0;i<4;i++){
    //     for(int j=0;j<5-i-1;j++){
    //         if(arr[j]>arr[j+1]){
    //             int temp = arr[j];
    //             arr[j]=arr[j+1];
    //             arr[j+1]=temp;
    //         }
    //     }
    // }

    for(int i=0;i<5;i++){
        printf("%d,",arr[i]);
    }
}