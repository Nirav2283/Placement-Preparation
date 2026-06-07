#include<stdio.h>

void main(){
    int arr[7] = {0, -1, 0, -3, 4, 0, 5};
    int newarr[7];
    int j = 0;
    for(int i=0;i<7;i++){
        if(arr[i]!=0){
            newarr[j] = arr[i];
            j++;
        }
    }
    for(int i = j ; i < 7 ;i++){
        newarr[j] = 0;
        j++;
    }
    for(int i=0;i<7;i++){
        printf("%d ",newarr[i]);
    }
}