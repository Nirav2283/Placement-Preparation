#include<stdio.h>
//WAP for following Scenario. 
// Given n rupees and a chocolate price of m for each chocolate, with a wrapper exchange offer of 1 
// chocolate per k wrappers, calculate the total number of chocolates you can eat with n rupees.  
void main(){
    int n = 15 , m = 1 , k = 3, tc , w;
    tc = n / m;
    w = n;
    while(w >= k){
        tc = tc + w / k;
        w = w / k + w % k;
    }
    printf("Total choclates: %d" , tc);
}