#include<stdio.h>

void main(){
    int a;
    printf("enter a number: ");
    scanf("%d" , &a);
    int count = 0;

    for(int i = 2 ; i <= a / 2 ;i++){
        if(i<=1){
            count = 0;
            break;
        }
        if(a % i == 0){
            count = 1;
            break;
        }
    }

    if(count == 0){
        printf("Prime");
    }else{
        printf("Not Prime");
    }
}