#include<stdio.h>

void main(){
    int sum = 0;
    for(int i = 1 ; i <= 10 ; i++){
        sum += i;
    }
    printf("Sum of 10 number is : %d" , sum);
}