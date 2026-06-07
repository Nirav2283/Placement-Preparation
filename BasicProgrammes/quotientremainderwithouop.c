#include<stdio.h>

void main(){
    int a=6 , b=4;
    int remainder,big,small,quotient=0;

    if(a>b){
        big = a;
        small = b;
    }else{
        big = b;
        small = a;
    }

    remainder = big;

    while(remainder >= small){
        remainder -= small;
        quotient++;
    }

    printf("Quotient: %d\n",quotient);
    printf("Remainder: %d",remainder);


}