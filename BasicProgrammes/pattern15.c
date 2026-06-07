// 1
// 22
// 333
// 4444
// 55555
#include<stdio.h>

void main(){
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            printf("%d",i);
        }
        printf("\n");
    }
}