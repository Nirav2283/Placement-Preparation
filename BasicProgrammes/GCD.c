#include<stdio.h>

void main(){
    int a , b;
    printf("enter a number 1: ");
    scanf("%d" , &a);
    printf("enter a number 2: ");
    scanf("%d" , &b);

    int min = a < b ? a : b;
    int gcd = 0;
    for(int i = 1; i<=min ; i++){
        if(a % i ==0 && b % i == 0){
            gcd = i;
        }
    }
    printf("GCD is : %d", gcd);
}