#include<stdio.h>
// 4 4 4 4 4 4 4
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4
void main(){
    int n = 4;
    int size = 2*n - 1;

    for(int i = 1; i <= size ; i++){
        for(int j = 1 ;j<=size ; j++){
            //manual logic
            // if(i == 1 || j == 1 || i == size || j == size){
            //     printf("%d " , n);
            // }else if(i == 2 || j == 2 || i == size - 1 || j == size - 1){
            //     printf("%d " , n - 1);
            // }else if(i == 3 || j == 3 || i == size - 2 || j == size - 2){
            //     printf("%d " , n - 2);
            // }else{
            //     printf("%d ",n - 3);
            // } 

            for(int k = 1 ; k <= n ; k++){
                if(i == k || j == k || i == size - k + 1 || j == size - k + 1){
                    printf("%d " , n - k + 1);
                    break;
                }
            }
        }
        printf("\n");
    }
}