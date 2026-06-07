//sum of 1 + (1 + 2) + (1 + 2 + 3) + ....

#include<stdio.h>
#include<math.h>

void main(){
    // int n;
    // printf("Enter a terms: ");
    // scanf("%d" , &n);
    // int sum = 0;
    // for(int i = 1 ; i <= n ; i++){
    //     int innersum = 0;
    //     for(int j = 1 ; j <= i ; j++){
    //         innersum += j;
    //     }
    //     sum += innersum;
    // }
    // printf("sum: %d" , sum);

    int n =3;
    int sum =0;
    for(int i = 1; i<=n ;i++){
        int innersum = 0;
        for(int j = 1 ; j<=i ;j++){
            innersum = (innersum + j);
        }
        sum += pow(innersum,i);
    }

    printf("%d",sum);
}