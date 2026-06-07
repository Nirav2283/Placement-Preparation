// 1
// 123
// 12345
// 1234567
// 123456789

#include<stdio.h>

void main(){
    int n = 6;
    for(int i=1;i<n;i++){
        for(int j=1;j<=2*i-1;j++){
            printf("%d",j);
        }
        printf("\n");
    }
}