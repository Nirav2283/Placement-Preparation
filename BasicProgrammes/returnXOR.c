#include<stdio.h>
// You are given an integer n and an integer start. Define an array 
// nums where nums[i] = start + 2 * i 
 
// Return the bitwise XOR of all elements of nums
void main(){
    int result = 0;
    int start = 0;
    int n = 5;
    for(int i=0 ; i< n ;i++){
        result = result ^ (start + 2*i) ;
    }

    printf("XOR:%d" , result);
}