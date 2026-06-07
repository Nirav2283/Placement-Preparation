// 1 
// 1 2 1 
// 1 * 3 * 1 
// 1 * * 4 * * 1 
// 1 * * * 5 * * * 1 
// 1 * * * * 6 * * * *1

#include<stdio.h>

void main(){
    for(int i = 1 ; i <= 6 ; i++){
        printf("1 ");
        for(int j = 1 ; j <= i-1 ;j++){
            if(j == i-1){
                printf("%d " ,i);
            }else{
                printf("* ");
            }
        }

        for(int k = 1 ; k <= i - 2 ; k++){    
                printf("* ");
        }
        if(i > 1){
            printf("1 ");
        }
        printf("\n");
    }
}