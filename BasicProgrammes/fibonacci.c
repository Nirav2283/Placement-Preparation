#include<stdio.h>

void main(){
    int n1=0 , n2=1 , n3;
    int n=8;
    printf("%d,%d",n1,n2);
    for(int i=1;i<=n-2;i++){
        n3=n1+n2;
        printf(",%d",n3);
        n1=n2;
        n2=n3;
    }
}