#include<stdio.h>
#include<math.h>

void main(){
    int octal = 531;
    int decimal = 0 , power=0;
    // int i = 0;
    int temp = octal;
    
    while(temp != 0){
        int digit = temp % 10;
        decimal += digit * pow(8 , power);
        temp = temp / 10;
        power++;
    }

    printf("Decimal form : %d" , decimal);
}