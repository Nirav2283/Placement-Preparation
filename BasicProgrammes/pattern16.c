// 1
// 01
// 010
// 1010
// 10101

#include<stdio.h>

void main(){
    int n=5;
    int num=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            printf("%d",num);
            num = 1-num;
        }
        printf("\n");
    }
}