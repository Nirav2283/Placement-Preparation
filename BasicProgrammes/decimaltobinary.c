#include<stdio.h>

void main(){
    int n = 5;
    int binary[100] , i=0;
    int temp = n;
    while(temp != 0){
        int remainder = temp % 2;
        binary[i] = remainder;
        i++;
        temp /= 2;
    }

    for(int j = i - 1 ; j >= 0 ;j--){
        printf("%d" , binary[j]);
    }
}