// Write a Function that returns either 1 or 0 based on following condition if the array is in ascending order 
// and occurrence of that number at least 3 then it should return 1 otherwise it should return 0.  
// e.g. if A=[1,1,1,2,2] it should return 0, if A= [1,1,1,3,3,3,3] it should return 1. 


#include<stdio.h>

int checkasceandocc(int arr[],int n){    
    // it is for checking ascending order or not
    for(int i=0;i<n-1;i++){
        if(arr[i] > arr[i+1]){
            return 0;
        }
    }

    int count=1;
    for(int i=1;i<n;i++){
        if(arr[i]==arr[i-1]){
            count++;
        }else{
            if(count<3) return 0;
            count=1;
        }
    }

    if(count < 3){
        return 0;
    }


    return 1;
}
void main(){
    int arr[5] = {1,1,1,2,2};
    int arr2[7]= {1,1,1,3,3,3,3};

    printf("%d\n",checkasceandocc(arr,5));
    printf("%d",checkasceandocc(arr2,7));

}

