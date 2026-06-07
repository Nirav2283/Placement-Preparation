#include<stdio.h>

int findele(int arr[],int n , int i , int e){
    if(i == n){
        return -1;
    }

    if(arr[i] == e){
        return i;
    }

    return findele(arr,n,i+1,e);
}
void main(){
    int arr[5]={10,20,30,40,50};
    int size = 5;
    int found = findele(arr,size,0,50);
    printf("%d" , found);
}