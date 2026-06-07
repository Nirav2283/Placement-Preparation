// WAP to find weather given number is Pronic or not. 
// A Pronic Number is defined as a number that is the product of two consecutive non-negative integers. In 
// other words, N is a Pronic Number if there exists a non-negative integer k such that N = k * (k + 1).  
// E.g. 6 is a Pronic Number because 6=2*3

#include<stdio.h>

void main(){
    int n;
    printf("Enter a number: ");
    scanf("%d" , &n);
    int found = 0;
    for(int i=0;i<=n;i++){
        if(i*(i+1)==n){
            found = 1;
            break;
        }
    }
    if(found==1) printf("Pronic");
    else printf("Not pronic");
}