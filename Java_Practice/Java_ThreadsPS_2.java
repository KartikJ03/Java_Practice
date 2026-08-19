class ThrPS1 extends Thread{
    public void run(){
        while(true) {
                try {
                    Thread.sleep(200);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            System.out.println("good morning");
        }
    }
}
class ThrPS3 extends Thread{
    public void run(){
        while(true) {
            try {
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}
public class Java_ThreadsPS_2 {
    public static void main(String [] args){
        ThrPS1 t1 = new ThrPS1();
        ThrPS3 t2 = new ThrPS3();
        t1.start();
        t2.start();
    }
}
