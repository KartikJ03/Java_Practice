class ThrPS extends Thread{
    public void run(){
        while(true) {
            System.out.println("good morning");
        }
    }
}
class ThrPS2 extends Thread{
    public void run(){
        while(true) {
            System.out.println("Welcome");
        }
    }
}
public class Java_ThreadsPS_1 {
    public static void main(String [] args){
        ThrPS t1 = new ThrPS();
        ThrPS2 t2 = new ThrPS2();
        t1.start();
        t2.start();
    }
}
