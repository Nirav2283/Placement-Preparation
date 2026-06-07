// 1 
// 2   5 
// 3   6   8 
// 4   7   9  10

#include<stdio.h>

void main(){
    int n = 4;
    int num = 1;
    for(int i=1;i<=n;i++){
        int sum=num;
        int diff = n-1;
        for(int j=1;j<=i;j++){
            printf("%d ",sum);
            sum += diff;
            diff--;
        }
        printf("\n");
        num++;
    }
}