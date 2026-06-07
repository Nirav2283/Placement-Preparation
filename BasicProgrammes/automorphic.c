// WAP to find weather given number is Automorphic or not. 
// An automorphic number is a number whose square ends with the same digits as the number itself.  
// For example, 5 is automorphic because 5² = 25, which ends in 5.  
// Similarly, 76 is automorphic because 76² = 5776, which ends in 76. 

#include<stdio.h>

void main(){
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    int sq = n*n;
    int temp = n;
    int count = 0;
    while(temp > 0){
        temp /= 10;
        count++;
    }
    int div = 1;
    for(int i = 0; i < count ; i++){
        div = div * 10;
    }

    if(sq % div == n) printf("Automorphic");
    else printf("Not automorphic");

    // int div = 1;
    // while(temp > 0){
    //     div = div * 10;
    //     temp /= 10;
    // }
    // printf("%d" , div);
    
}