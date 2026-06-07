#include<stdio.h>
#include<ctype.h>
// a 
// B c
// D e F
// g H i J
// k L m N o
void main(){
    int n=5;
    char ch='a';
    int flag=0;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if(flag == 0){
                printf("%c ",ch);
            }else{
                printf("%c ",toupper(ch));
            }
            flag=!flag;
            ch++;
        }
        printf("\n");
    }
}