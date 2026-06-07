// input : 1 2 3
//         4 5 6 
//         7 8 9

// output : 7 4 1
//          8 5 2
//          9 6 3

#include<stdio.h>
void main(){
    int arr[3][3];
    int arr2[3][3];

    for(int i = 0 ; i < 3 ; i++){
        for(int j = 0 ; j < 3 ; j++){
            printf("Enter an element : ");
            scanf("%d" , &arr[i][j]);
        }
    }

    // for(int i = 0 ; i < 3 ; i++){
    //     for(int j = 0 ; j < 3 ; j++){
    //         printf("%d " , arr[i][j]);
    //     }
    //     printf("\n");
    // }

    //rotate

    for(int i = 0 ; i < 3 ; i++){
        for(int j = 0 ; j < 3 ;j++){
            arr2[j][3 - i -1] = arr[i][j];
        }
    }

    for(int i = 0 ; i < 3 ; i++){
        for(int j = 0 ; j < 3 ; j++){
            printf("%d " , arr2[i][j]);
        }
        printf("\n");
    }


}