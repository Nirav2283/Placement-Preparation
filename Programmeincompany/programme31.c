#include<stdio.h>

void main(){
    int reds[] = {2, 7, 4, 1};
    int blues[] = {3, 5, 6, 2};

    int redheight = 0;
    int blueheight = 0;

    for(int i=0;i<4;i++){
        if(i%2==0){
            redheight += reds[i];
        }else{
            redheight += blues[i];
        }

        if(i%2 == 0){
            blueheight += blues[i];
        }else{
            blueheight += reds[i];
        }
    }

    // printf("%d",redheight);
    // printf("%d",blueheight);

    if(redheight > blueheight){
        printf("Maximum height : %d",redheight);
    }else{
        printf("Maximum height : %d",blueheight);
    }
}