//input: 111 , output : 39

#include<stdio.h>
#include<math.h>
//idea : convert base 7 to decimal then decimal to hex
void main(){
    int base7 = 111;
    int temp=base7;
    int power=0,decimal=0;
    while(temp!=0){
        int digit = temp%10;
        decimal+=digit*pow(7,power);
        power++;
        temp/=10;
    }

    // printf("Decimal is: %d\n",decimal);


    int hexa[100];
    char digits[]= {'0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9'};
    char alpha[] = {'A' , 'B' , 'C' , 'D' , 'E' ,'F'};
    int temp2 = decimal;
    int i=0;
    while(temp2!=0){
        int remainder = temp2%16;
        if(remainder<10){
            hexa[i] = digits[remainder];
        }else{
            hexa[i] = alpha[remainder-10];
        }
        i++;
        temp2/=16;
    }

    printf("Hexadecimal is: ");
    for(int j=i-1;j>=0;j--){
        printf("%c",hexa[j]);
    }

}