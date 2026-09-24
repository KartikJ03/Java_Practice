// Not understood
class counter1{
    int count = 0;

    void increment(){
        count++;
    }
}
class MyRunnable implements Runnable{
    counter1 counter;
    MyRunnable(counter1 counter){
        this.counter = counter;
    }
    public void run(){
        for(int i = 0 ; i < 1000 ; i++){
            counter.increment();
        }
    }
}
public class raceConditions_Java {
    public static void main(String [] args){

    }
}
