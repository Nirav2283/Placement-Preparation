#include<stdio.h>
#include<string.h>

void main(){
    char str[] = "abcba";
    char temp[100] ;
    int j = 0;
    for(int i = strlen(str) - 1 ; i >= 0  ; i--){
        temp[j] = str[i];
        j++;
    }
    // temp[j] = '\0';
    if(strcmp(str,temp) == 0){
        printf("Palindrome");
    }else{
        printf("Not Palindrome");
    }
}