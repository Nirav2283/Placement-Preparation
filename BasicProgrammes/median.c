#include<stdio.h>
//condition : after merging array
void main(){
    int arr[5] = {1,12,15,26,38};
    int arr2[5] = {2,13,17,30,45};
    int merge[10];
    int n = sizeof(merge) / sizeof(merge[0]);
    int i=0,j=0;
    for(int k=0;k<10;k++){
        if(arr[i]<arr2[j]){
            merge[k]=arr[i];
            i++;
        }else{
            merge[k]=arr2[j];
            j++;
        }
    }

    int median = (merge[n/2-1]+merge[n/2])/2;
    printf("Median is: %d",median);

    // for(int i=0;i<10;i++){
    //     printf("%d,",merge[i]);
    // }
}