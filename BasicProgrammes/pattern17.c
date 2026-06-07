#include<stdio.h>
#include<string.h>
//n
//ni
//nir
//nira
//nirav
void main(){
    char str[] = "nirav";
    for(int i=0;i<=str[i]!='\0';i++){
        for(int k=0;k<strlen(str)-i;k++){
            printf(" ");
        }
        for(int j=0;j<=i;j++){
            printf("%c ",str[j]);
        }

        printf("\n");
    }
}