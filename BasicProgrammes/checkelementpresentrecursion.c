#include<stdio.h>
#include<stdbool.h>

int arr[] = {1,2,3,4,5};
int size = sizeof(arr) / sizeof(arr[0]);

int isInArray(int a [], int m){
    static int i = 0;
    if(i == size){
        return 0;
    }
    if(arr[i++] == m){
        return 1;
      
    }
    return isInArray (a , m);
}
void main(){
    if(isInArray(arr , 10)){
        printf("Present");
    }else{
        printf("Not present");
    }
}