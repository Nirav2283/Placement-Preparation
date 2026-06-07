#include<stdio.h>

int sumofdigit(int n){
    if(n == 0){
        return 0;
    }
    return n%10 + sumofdigit(n/10);
}
void main(){
    int n = 34567;
    printf("sum is : %d" , sumofdigit(n));
}

