class Thread1 extends Thread{

    public void run(){
        int i = 0;
        while(i<4000) {
            System.out.println("I am cooking for thread1");
            i++;
        }

    }
}
class Thread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<4000) {
            System.out.println("I am thread 2 chatting with her");
            i++;
            }
        }
}
public class Java_Threads {
    public static void main(String [] args){
        Thread1 t1  = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();


    }
}
