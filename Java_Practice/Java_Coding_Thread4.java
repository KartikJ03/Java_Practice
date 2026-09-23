class ThreaGpt implements Runnable{
    public void run(){
        int i = 0;
        while(i<50) {
            System.out.println("Thread 1 is running");
            i++;
        }
    }
}
class ThreaGpt2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<50) {
            System.out.println("Thread 2 is running");
            i++;
        }
    }
}
public class Java_Coding_Thread4 {
    public static void main(String [] args){
        ThreaGpt obj = new ThreaGpt();
        Thread t1 = new Thread(obj);
        t1.start();
        ThreaGpt2 obj1 = new ThreaGpt2();
        Thread t2 = new Thread(obj1);
        t2.start();

    }
}
