#include<stdio.h>

void main(){
    int a,b;
    char ch;

    printf("Enter a number 1: ");
    scanf("%d",&a);

    printf("Enter a number 2: ");
    scanf("%d",&b);

    printf("Enter a operator(+,-,*,/): ");
    scanf(" %c",&ch);

    switch(ch){
        case '+':
            printf("%d",a+b);
            break;
        case '*':
            printf("%d",a*b);
            break;
        case '-':
            printf("%d",a-b);
            break;

        case '/':
            printf("%d",a/b);
            break;
        default :
            printf("Invalid");
    }
}