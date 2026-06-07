// Given a string that contains a special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), 
// reverse the string in a way that special characters are not affected. 
// Input: a!!!b.c.d,e'f,ghi 
// Output: i!!!h.g.f,e'd,cba 
// Input:   str = “Ab,c,de!$” 
// Output:  str = “ed,c,bA!$” 

#include<stdio.h>
#include<string.h>

void main(){
    char str[] = "a!!!b.c.d,e'f,ghi";
    char temp[100];
    int len = strlen(str);

    int j=0;
    for(int i=len-1 ; i>=0 ; i--){
        if((str[i] >= 'A' && str[i] <= 'Z') || (str[i] >= 'a' && str[i] <= 'z')){
            temp[j] = str[i];
            j++;
        }
    }
    j=0;
    for(int i=0 ; i<len ; i++){
        if((str[i] >= 'A' && str[i] <= 'Z') || (str[i] >= 'a' && str[i] <= 'z')){
            str[i] = temp[j];
            j++;
        }
    }

    printf("%s",str);
}