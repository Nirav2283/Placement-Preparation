#include<stdio.h>
#include<string.h>
#define MAX 100

char stack[MAX];
int top = -1;
void push(char ch){
    top++;
    stack[top] = ch;
}
char pop(){
    return stack[top--];
}

int isMatching(char open , char close){
    if(open == '(' && close == ')'){
        return 1;
    }
    if(open == '[' && close == ']'){
        return 1;
    }
    if(open == '{' && close == '}'){
        return 1;
    }
    return 0;
}

int isBalanced(char expr[]){
    for(int i=0;i<strlen(expr);i++){
        char ch = expr[i];
        if(ch == '(' || ch == '[' || ch == '{'){
            push(ch);
        }
        else if(ch == ')' || ch == ']' || ch == '}'){
            if(top == -1){
                return 0;
            }
            char open = pop();
            if(!isMatching(open,ch)){
                return 0;
            }
        }
    }
    return top==-1;
}
void main(){
    char expr[] = "[]()";

    if(isBalanced(expr)){
        printf("balanced");
    }else{
        printf("Not balanced");
    }
}