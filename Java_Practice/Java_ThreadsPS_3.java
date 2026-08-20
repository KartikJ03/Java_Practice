class ThrPSPrior1 extends Thread{
    public void run(){
            try {
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("good morning");
    }
}
class ThrPSPrior2 extends Thread{
    public void run(){
            try {
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");

    }
}
public class Java_ThreadsPS_3 {
    public static void main(String [] args){
        ThrPSPrior1 p1 = new ThrPSPrior1();
        ThrPSPrior2 p2 = new ThrPSPrior2();
        p1.setPriority(6);
        System.out.println(p1.getPriority());
        p1.start();
        p2.start();

    }
}
