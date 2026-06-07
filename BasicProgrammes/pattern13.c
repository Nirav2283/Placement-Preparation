// 1
// 121
// 12321
// 1234321
// 123454321

#include<stdio.h>

void main(){
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            printf("%d",j);
        }
        for(int k=i-1;k>=1;k--){
            printf("%d",k);
        }
        printf("\n");
    }
    
}