#include<stdio.h>
#include<math.h>

void main(){
    int hour , min;
    printf("Enter an hour: ");
    scanf("%d",&hour);
    printf("Enter an minute: ");
    scanf("%d",&min);
    float angle;
    int minangle = min*6;
    int hourangle = 30*(hour%12)+0.5*min;
    angle = fabs(hourangle - minangle);
    printf("%f",angle);
}