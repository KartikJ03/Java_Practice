class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<400){
            System.out.println("I am running thread 1");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<400){
            System.out.println("I am running thread 2");
            i++;
        }
    }
}
public class Java_Threads_1 {
    public static void main(String [] args){
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread t1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread t2 = new Thread(bullet2);

        t1.start();
        t2.start();
    }
}
