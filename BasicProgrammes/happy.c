// Write a program to check whether number is Happy number or not.  
// A happy number are those number whose digit’s square summation eventually reaches to 1, if the 
// sequence start repeating then it is not a happy number.   
// E.g., 49 is a happy number whose sequence is 49 97 130 10 1. 
// E.g., 50 is not a happy number whose sequence is 50 25 29 85 89 145 42 20 4 16 37 58 89 it should stop 
// when 89 is detected 2nd time and print 50 is not a happy number. 

#include<stdio.h>

void main(){
    int n;
    printf("ENter a number: ");
    scanf("%d" , &n);
    int temp;
    int sum;
    while(n!=1 && n!=4){
        sum = 0;
        temp = n;
        while(temp > 0){
            int digit = temp % 10;
            sum += digit * digit;
            temp /= 10;
        }
        n = sum;
    }
    if(n == 1){
        printf("Happy");
    }else{
        printf("Not happy");
    }
}