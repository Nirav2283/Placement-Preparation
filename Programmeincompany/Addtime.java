public class Addtime {

    static class Time{
        int hours;
        int minute;
        int second;
        public Time(int h , int m , int s){
            this.hours = h;
            this.minute = m;
            this.second = s;
        }

        void addtime(int s){
            second += s;
            while(second >= 60){
                second -= 60;
                minute += 1;
            }   
            while(minute >= 60){
                minute -= 60;
                hours += 1;
            }      
        }

        void subtracttime(int s){
            second -= s;
            while(second < 0){
                second += 60;
                minute -= 1;
            }
            while(minute < 0){
                minute += 60;
                hours -= 1;
            }
        }

        void display(){
            System.out.println("Time is : " + hours + ":" + minute + ":" + second);
        }

        
    }
    public static void main(String[] args) {
        Time t = new Time(2,30,45);
        t.addtime(50);

        t.display();

        t.subtracttime(40);
        t.display();
    }
}
