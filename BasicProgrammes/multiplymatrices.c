#include<stdio.h>

void main(){
    // int x,y,z,w;
    // printf("Enter Row and col for array 1: ");
    // scanf("%d %d",&x,&y);
    // int arr[x][y];
    // printf("Enter elements of array 1: \n");
    // for(int i=0;i<x;i++){
    //     for(int j=0;j<y;j++){
    //         scanf("%d",&arr[i][j]);
    //     }
    // }

    // printf("Enter Row and col for array 2: ");
    // scanf("%d %d",&z,&w);
    // int arr2[z][w];
    // printf("Enter elements of array 2: \n");
    // for(int i=0;i<z;i++){
    //     for(int j=0;j<w;j++){
    //         scanf("%d",&arr2[i][j]);
    //     }
    // }

    // if(y!=z){
    //     printf("Multiplication is not possible");
    // }

    int arr[2][2] = {{1,2},{3,4}};
    int arr2[2][2] = {{5,6},{7,8}};

    int arr3[2][2]; //x ,w 

    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            arr3[i][j] = 0;
        }
    }

    for(int i=0; i<2;i++){
        for(int j=0;j<2;j++){
            for(int k=0 ; k<2 ;k++){ //y
                arr3[i][j] = arr3[i][j] + (arr[i][k] * arr2[k][j]);
            }
        }
    }

    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            printf("%d ",arr3[i][j]);
        }
        printf("\n");
    }

    




}