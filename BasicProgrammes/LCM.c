#include<stdio.h>

void main(){
    int a , b;
    printf("enter a number 1: ");
    scanf("%d" , &a);
    printf("enter a number 2: ");
    scanf("%d" , &b);

    int max = a > b ? a : b;
    int lcm = 0;
    for(int i = max ; i<=a*b ; i++){
        if(i % a ==0 && i % b == 0){
            lcm = i;
            break;
        }
    }
    printf("LCM is : %d", lcm);
}