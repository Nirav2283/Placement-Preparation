#include<stdio.h>

void main(){
    int n = 6;
    int prices[6] = {1,2,3,4,5} ;

    int profit = 0;
    for(int i=1;i<n;i++){
        if(prices[i] > prices[i-1]){
            profit+=prices[i] - prices[i-1];
        }
    }
    printf("%d",profit);
}