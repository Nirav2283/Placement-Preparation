#include<stdio.h>
#include<math.h>

void main(){
    char hexdec[50];
    printf("Enter a Hexadecimal: ");
    scanf("%s" , &hexdec);
    char arr[50];
    int i = 0;
    while(hexdec[i] != '\0'){
        arr[i] = hexdec[i];
        i++;
    }
    // for(int j = 0 ; j < i ; j++){
    //     printf("%c" , arr[j]);
    // }
    int decimal = 0 , power = 1;
    char digits[]= {'0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9'};
    char alpha[] = {'A' , 'B' , 'C' , 'D' , 'E' ,'F'};

    for(int j = i - 1 ; j >= 0 ; j--){
        int value;
        if(arr[j] >= digits[0] && arr[j] <= digits[9]){
            value = arr[j] - digits[0]; // '8' - '0' = 56 - 48 = 8
        }else if(arr[j] >= alpha[0] && arr[j] <= alpha[5]){
            value = arr[j] - alpha[0] + 10; // 'F' - 'A'  + 10 = 70 - 65 + 10 = 15 
        }

        decimal += value * power; // 15*1 = 15 , 8  * 16 
        power *= 16; //16 , 16^2
    }
    
    printf("decimal : %d" , decimal);
   
}