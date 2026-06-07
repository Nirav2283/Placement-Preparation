//problem statement : there is a array from starting 1 to n .....
//and there is a only 1 missing number in the array from series 1 to n
//then find that number
//condition : O(n) complexity (dont use nested for loop)
// input : A[] = {1,5,6,2,3,7} , output : 4

#include<stdio.h>

void main(){
    int arr[6] = {1,5,6,2,3,7};
    int sum = 0 , max = arr[0];
    for(int i = 0 ; i < 6 ; i++){
        if(max < arr[i]){
            max = arr[i];
        }
        sum += arr[i];
    }
    // printf("Max: %d" , max);
    // printf("sum: %d" , sum);

    //1 to 7 sum
    int actualsum = max*(max+1)/2;
    printf("Missing element is : %d" , actualsum - sum);

}