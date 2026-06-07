#include<stdio.h>
void main(){
    int arr[3][3];
    printf("Enter elements: \n");
    for(int i=0 ; i<3;i++){
        for(int j=0;j<3;j++){
            scanf("%d",&arr[i][j]);
        }
    }

    for(int i=0 ; i<3;i++){
        for(int j=0;j<3;j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
    int total=0;
    for(int i=0;i<3;i++){
        int row = 0 ;
        for(int j=0;j<3;j++){
            row+=arr[i][j];
        }
        total+=row;
        printf("Row %d = %d\n", i+1 , row);
    }
    

    for(int i=0;i<3;i++){
        int col=0;
        for(int j=0;j<3;j++){
            col+=arr[j][i];
        }
        printf("Column %d = %d\n", i+1 , col);
    }

    printf("Total: %d",total);


}