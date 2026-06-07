#include<stdio.h>

void main(){
    int n = 10;
    int fact = 1;

    for(int i = n ; i>=1 ;i--){
        fact *= i;
    }

    // printf("%d",fact);

    int facts[100];

    int i=0;
    while(fact > 0){
        facts[i] = fact % 10;
        fact /= 10
        i++
    }

    int countzero = 0;
    int j=0;

    while(facts[j] == 0){
        countzero ++;
        j++;
    }

    printf("Trailing zeros: %d" , countzero);
    
}