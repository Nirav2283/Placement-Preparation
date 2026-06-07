//      1
//     A B
//    2 3 4 
//   C D E F

#include<stdio.h>

void main(){
    int n = 4;
    int ch='A';
    int num=1;
    for(int i=1;i<=n;i++){
        for(int s=1;s<=n-i;s++){
            printf(" ");
        }
        if(i%2==0){
            for(int j=1;j<=i;j++){
                printf("%c ",ch);
                ch++;
            }
        }else{
            for(int j=1;j<=i;j++){
                printf("%d ",num);
                num++;
            }
        }
        // for(int j=1;j<=(n-i);j++){
        //     printf(" ");
        // }
        // for(int k=1;k<=i;k++){
        //     printf("* ");
        // }
        printf("\n");
    }
}

