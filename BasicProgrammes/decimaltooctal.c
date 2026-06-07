#include<stdio.h>

void main(){
    int decimal = 345;
    int octal[100];
    int temp = decimal;
    int i = 0;
    while(temp != 0){
        int remainder = temp % 8;
        octal[i] = remainder;
        i++;
        temp = temp/8;
    }
    
    for(int j = i-1 ; j >= 0 ;j--){
        printf("%d" , octal[j]);
    }
}