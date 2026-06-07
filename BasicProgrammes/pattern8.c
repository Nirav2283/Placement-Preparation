#include<stdio.h>
// For n=5 
// 1 2 3 4 5 
// 10 9 8 7 6 
// 11 12 13 14 15 
// 20 19 18 17 16 
// 21 22 23 24 25 
void main(){
    int n = 5 , num = 1;
    for(int i = 1 ; i <= n ; i++){
        if(i % 2 == 1){
            for(int j = 1 ; j<=n ;j++){
                printf("%d ",num);
                num++;
            }
        }else{
            int start = num + 5 - 1;
            for(int j = 0 ; j < n ; j++){
                printf("%d ", start--);
            }
            num = num + n;
        }
        printf("\n");
    }
}