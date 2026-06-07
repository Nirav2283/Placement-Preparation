#include<stdio.h>

void main(){
    int n = 12;
    for(int i=2;i<=n;i++){
        int isPrime=1;
        if(n%i==0){
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime=0;
                    break;
                }
            }
            if(isPrime==1){
                printf("%d,",i);
            }
        }
    }
}