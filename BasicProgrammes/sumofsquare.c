#include<stdio.h>

void main(){
    int sum = 0;
    for(int i = 1 ; i <= 3 ; i++){
        sum += i*i;
    }
    printf("Sum of 1+4+9 is : %d" , sum);
}