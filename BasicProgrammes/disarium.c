#include<stdio.h>
#include<math.h>
void main(){
    int n=135;
    int temp=n , count=0;
    while(temp!=0){
        temp/=10;
        count++;
    }
    // printf("%d",count);
    temp=n;
    int sum=0;
    while(temp>0){
        int digit=temp%10;
        sum = sum+(int)round(pow(digit,count));
        count--;
        temp/=10;
    }
    // printf("%d",sum);
    if(sum == n){
        printf("Disarium");
    }else{
        printf("Not Disarium");
    }

}