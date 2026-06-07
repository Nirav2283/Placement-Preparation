#include<stdio.h>
#include<math.h>

void main(){
    int arr[3] = {1,0,1};
    int sum=0;
    int power = 1;
    for(int i=2 ;i>=0;i--){
        sum+=arr[i]*power;
        power*=2;
    }

    printf("%d",sum);
}