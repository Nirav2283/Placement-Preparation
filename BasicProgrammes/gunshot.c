#include<stdio.h>

// a chef is playing a video game , and now he is fighting to boss
// a health of boss is H point , 
// chef has 2 weapons 
// 1.  have a shotguns which damage X points
// 2 . have a laser which damage a Y1 points , after kth time use of laser the damage is Y2 points (Y2<Y1)
// you can not change a weapon after a game starting
// so , how many minimum shots required to kill the boss??
// input :
// H = 20
// X = 4 //1 shot = 4 damage point
// Y1 = 12`
// K = 3
// Y2 = 1
void main(){
    int h = 20 , x = 4 , y1 = 12 , k = 3 , y2 = 1;

    int gunshot = h / x; 
    int lasercount = 0;
    while(h > 0){
        if(k > 0){
            h = h - y1; //8 , -4 
            lasercount++; //1 2
            k--; //2 1
        }else{
            h = h - y2;
            lasercount++;
        }
    }
    printf("Gunshot: %d\n", gunshot);
    printf("lasershot: %d\n" , lasercount);
    int ans = gunshot < lasercount ? gunshot : lasercount;
    printf("Minimum shot: %d" ,ans);
}

