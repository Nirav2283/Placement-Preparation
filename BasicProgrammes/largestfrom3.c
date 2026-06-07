#include<stdio.h>

void main(){
    int a=10,b=30,c=20;
    if(a == b && b == c && a == c){
        printf("all number is equal");
    }else {
         if(a>b){
        if(a>c){
            printf("a is greater");
        }else{
            printf("c is greater");
        }
    }else{
        if(b>c){
            printf("b is greater");
        }else{
            printf("c is greater");
        }
    }
    }
   
}