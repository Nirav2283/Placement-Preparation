//find the factorial of 5
#include<stdio.h>

void main(){
    int fact = 1;
    for(int i = 5 ; i > 0 ; i--){
        fact = fact * i;
    }
    printf("Factorial of 5 is: %d" , fact);
}