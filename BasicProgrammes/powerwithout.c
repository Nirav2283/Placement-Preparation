#include<stdio.h>

void main(){
    int base , exp;
    printf("Enter base: ");
    scanf("%d" , &base);
    printf("Enter exp: ");
    scanf("%d" , &exp);
    int res = 1;
    for(int i = 1 ; i <= exp ; i++){
        int temp=0;
        for(int j = 1 ; j <= base ; j++){
            temp += res;
        }
        res = temp;
    }
    printf("%d" , res);

}