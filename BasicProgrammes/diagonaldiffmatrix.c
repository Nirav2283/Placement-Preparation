#include<stdio.h>
#include<stdlib.h>

void main(){
    int arr[3][3] = {
        {1,2,3},
        {4,5,6},
        {9,8,9}
    };

    int n = 3;

     int leftdiag = 0;
     int rightdiag = 0;

    for(int i=0;i<3;i++){
        leftdiag += arr[i][i];
        rightdiag += arr[i][n-i-1];
    }

    printf("%d",abs(leftdiag - rightdiag));
    

}