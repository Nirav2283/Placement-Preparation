#include<stdio.h>

void main(){
    int n=145;
    int temp=n;
    int count=0;
    // while(temp!=0){
    //     temp/=10;
    //     count++;
    // }
    // printf("%d",count);

    int sum=0;
    while(temp != 0){
        int digit = temp % 10;
        int fact = 1;
        for(int i = 1;i<=digit;i++){
            fact*=i;
        }
        sum += fact;
        temp /=10;
    }

    if(n == sum){
        printf("Strong");
    }else{
        printf("Not a strong");
    }


}