// return duplicate element in array using O(n) complexity.

#include<stdio.h>
#include<stdbool.h>

void main(){
    int arr[5] = {1,3,4,2,2};
    bool visited[100] = {false};

    for(int i=0;i<5;i++){
        if (visited[arr[i]]) {
            printf("%d ", arr[i]);
        } else {
            visited[arr[i]] = true;
        }
    }
}