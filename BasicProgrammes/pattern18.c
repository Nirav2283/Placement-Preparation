#include<stdio.h>
//      A 
//     1 2 
//    B C D 
//   3 4 5 6 
//  E F G H I 
void main(){
    int n=5;
    int num=1;
    int ch='A';

    for(int i=1;i<=n;i++){
        for(int k=0;k<=n-i;k++){
            printf(" ");
        }
        if(i%2==0){
            for(int j=1;j<=i;j++){
                printf("%d ",num);
                num++;
            }
        }else{
            for(int j=1;j<=i;j++){
                printf("%c ",ch);
                ch++;
            }
        }
        printf("\n");
    }
}