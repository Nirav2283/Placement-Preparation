#include<stdio.h>

void main(){
    int decimal = -1;
    int hexadecimal[100];
    char digits[]= {'0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9'};
    char alpha[] = {'A' , 'B' , 'C' , 'D' , 'E' ,'F'};
    int i = 0;
    int temp = decimal;
    while(temp != 0){
        int remainder = temp % 16;

        if(remainder < 10){
            hexadecimal[i] = digits[remainder];
        }else{
            hexadecimal[i] = alpha[remainder - 10];
        }
        i++;
        temp /= 16;
    }

    for(int j = i - 1 ; j >= 0 ; j--){
        printf("%c" , hexadecimal[j]);  
    }

    
}