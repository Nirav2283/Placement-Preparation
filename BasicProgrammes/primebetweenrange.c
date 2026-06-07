#include<stdio.h>

void main(){
    int a=10 , b = 20;

   
    for(int i = a ; i <=b ; i++){
         int count  = 0;
        for(int j=2 ; j<=i/2 ; j++){
            if(i % j == 0){
                count = 1;
                break;
            } 
        }
        if(count == 0){
            printf("%d ," , i);
        }
    }
}