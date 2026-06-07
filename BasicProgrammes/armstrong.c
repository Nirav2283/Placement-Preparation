#include<stdio.h>

void main(){
    int n=153,count=0,sum=0;
    int temp=n;
    while(temp!=0){
        count++;
        temp/=10;
    }
    // printf("%d",count);
    temp=n;
    // printf("%d",temp);
    while(temp!=0){
        int digit = temp % 10;
        int mul = 1;
        for(int i=1;i<=count;i++){
            mul *= digit;
        }
        sum += mul;
        temp/=10;
    }
    if(sum == n){
        printf("Number is armstrong");
    }else{
        printf("Number is not armstrong");
    }
}