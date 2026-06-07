//      1 
//     212 
//    32123 
//   4321234 
//    32123 
//     212 
//      1 

#include<stdio.h>

void main(){
    int n = 4;
    //upper half
    for(int i = 1 ; i <= n ; i++){
        for(int j = 1 ; j <= n - i ; j++){
            printf(" ");
        }
        for(int j = i ; j >= 1 ; j--){
            printf("%d" , j);
        }
        for(int j = 2 ; j <= i ; j++){
            printf("%d" , j);
        }
        printf("\n");
    }

    //lower half
    for(int i = n - 1  ; i >= 1 ; i--){
        for(int j = 1 ; j <= n - i ; j++){
            printf(" ");
        }
        for(int j = i ; j >= 1 ; j--){
            printf("%d" , j);
        }
        for(int j = 2 ; j <= i ; j++){
            printf("%d" , j);
        }
        printf("\n");
    }
}