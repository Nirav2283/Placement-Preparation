// You are given a 2D matrix containing only 0s and 1s. 
// Your task is to replace the elements as follows: 
// The first occurrence of 1 should be replaced by "A". 
// The second occurrence of 1 should be replaced by "AA". 
// The third occurrence of 1 should be replaced by "AAA", and so on. 

// Similarly, 
// The first occurrence of 0 should be replaced by "B". 
// The second occurrence of 0 should be replaced by "BB". 
// The third occurrence of 0 should be replaced by "BBB", and so on.

#include<stdio.h>

void main(){
    int x,y;
    
    printf("Enter row: ");
    scanf("%d",&x);
    printf("Enter column: ");
    scanf("%d",&y);
    int arr[x][y];
    printf("Enter matrix elements (0/1 only): \n");
    for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
            scanf("%d",&arr[i][j]);
        }
    }

    for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }

    int count0 = 0 , count1 = 0;
    printf("Output Matrix\n");
    for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
            if(arr[i][j]==1){
                count1++;
                for(int k=0;k<count1;k++){
                    printf("A");
                }
            }else{
                count0++;
                for(int k=0;k<count0;k++){
                    printf("B");
                }
                
            }
            printf("\t");
        }
        printf("\n");
    }

    // printf("%d",count1);

}