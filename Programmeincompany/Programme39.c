#include<stdio.h>

void main(){
    int skills[4] = {5, 3, 5, 8};

    int minhours = 100;
    for(int i=0;i<4;i++){`
        for(int j=i+1 ; j<4 ; j++){
            int diff = skills[i] - skills[j];
            
            if(diff < 0){
                diff = -diff;
            }


            if(diff < minhours) {
                minhours = diff;
            }

            // printf("%d",diff);
        }
    }

    printf("Min hours: %d",minhours);
}