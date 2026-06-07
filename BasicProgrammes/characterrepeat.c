#include<stdio.h>

void main(){
    char str[] = "geeksforgeeks";
    int index = 100; //randomly take big number
    char ans='\0';
    for(int i=0;str[i]!='\0';i++){
        for(int j=i+1;str[j]!='\0';j++){
            if(str[i]==str[j]){
                if(j<index){
                    index = j;
                    ans = str[i];
                    break;
                }
                
            }
            
        }
    }
    if(ans=='\0'){
        printf("No repeated character");
    }else{
        printf("%c",ans);
    }
}