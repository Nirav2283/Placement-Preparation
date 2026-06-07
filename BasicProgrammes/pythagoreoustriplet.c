// Write a program to generate Pythagorean triplets in 1 to 100. "3 4 5 is Pythagorean triplet where 
// 3*3+4*4=5*5.

#include<stdio.h>

void main(){
    for(int i=1;i<=100;i++){
        for(int j=1;j<=100;j++){
            for(int k=1;k<=100;k++){
                if(i*i+j*j==k*k){
                    printf("%d %d %d\n",i,j,k);
                }
            }
        }
    }
}