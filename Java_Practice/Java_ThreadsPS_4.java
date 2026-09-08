//This Practice Code Provides Understanding of threads (Not Runnable  interface)
class thrState extends Thread{
    public void run(){
        int i = 0;
        while(i<100) {
            System.out.println("Welcome to threads");
            i++;
        }
    }
}
class thrState1 extends Thread{

    public void run(){
        int i = 0;
        while(i<100) {
            System.out.println("Welcome to threads state");
            i++;
        }
    }
}
public class Java_ThreadsPS_4 {
    public static void main(String [] args){
        thrState t1 = new thrState();
        thrState1 t2 = new thrState1();
        System.out.println(Thread.currentThread().getState());
        t1.start();
        t2.start();
        System.out.println(t1.getState());

    }
}
