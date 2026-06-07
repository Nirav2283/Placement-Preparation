#include<stdio.h>

void main(){
    int n1 = 0;
    int n2 = 1;
    int n = 5;

    printf("Fibonacci Series: ");
    printf("%d %d" , n1,n2);
    for(int i = 2 ; i < n ;i++){
        int c = n1+n2;
        n1 = n2;
        n2 = c;
        printf(" %d",c);
    }
}