#include<stdio.h>
// 1      1
// 12    21
// 123  321
// 12344321
void main(){
    int n=4;
    for(int i=1;i<=n;i++){
        
        for(int j=1;j<=i;j++){
            printf("%d",j);
            
        }
        for(int j=1; j<=10-2*(i+1);j++){
            printf(" ");
        }
        for(int j=i;j>=1;j--){
            printf("%d",j);
           
        }
        printf("\n");
    }
}