#include<stdio.h>
#include<stdbool.h>
#include<string.h>

bool checkPalindrome(char str[] , int s , int e){
    if(s >= e){
        return true;
    }
    if(str[s] != str[e]){
        return false;
    }
    return checkPalindrome(str , s + 1 , e - 1);
}
void main(){
    char str[] = "abcba";
    int n = strlen(str);
    // printf("%d" , n);
    if(checkPalindrome(str , 0 , n - 1)){
        printf("Palindrome");
    }else{
        printf("Not palindrome");
    }
}