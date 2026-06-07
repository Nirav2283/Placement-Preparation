// sum of 1 - 2 + 3 - 4 + ...

#include<stdio.h>

void main(){
    int n ;
    printf("Enter the number: ");
    scanf("%d" , &n);
    int sum = 0;
    for(int i = 1 ; i <= n ; i++){
        if(i % 2 != 0){
            sum += i;
        }else{
            sum -= i;
        }
    }
    printf("%d" , sum);

}