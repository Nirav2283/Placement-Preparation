//calculate 2^3 without ^
#include<stdio.h>

void main(){
    int res = 1;
    for(int i = 1 ; i <= 3 ; i++){
        res *= 2;
    }
    printf("%d" , res);
}
