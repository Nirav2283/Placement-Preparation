// WAP to find weather given number is Kaprekar or not. 
// A Kaprekar number is a non-negative integer that, when squared, can be split into two parts whose sum 
// equals the original number.  
// For E.g. 45 is a Kaprekar number because 45 squared (2025) can be split into 20 and 25, and 20 + 25 = 45

#include<stdio.h>

void main(){
    int n;
    printf("Enter a number: ");
    scanf("%d",&n);
    int sq;
    sq = n*n;
    int count = 0;
    int temp = n;
    //count the digit in square
    while(temp>0){
        temp /= 10;
        count++;
    }
    // int mid = count / 2;
    int div = 1;
    for(int i = 0 ; i < count ; i++){
        div = div*10;
    }
    int left = sq / div;
    int right = sq % div;

    if(left + right == n){
        printf("Number is kaprekar");
    }else{
        printf("Number is not kaprekar");
    }
    // printf("%d\n" ,  right);
    // printf("%d\n" , left);
    // printf("%d\n" , div);
    // printf("%d" , count);
}