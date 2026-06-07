#include<stdio.h>

void main(){
    int n ,temp;
    printf("Enter the number: ");
    scanf("%d" ,&n);
    temp = n;
    int sum = 0;

    while(temp != 0){
        int digit = temp % 10;
        sum = sum + digit;
        temp = temp / 10;
    }

    if(n % sum == 0){
        printf("number is harshad");
    }else{
        printf("number is not harshad");
    }
}