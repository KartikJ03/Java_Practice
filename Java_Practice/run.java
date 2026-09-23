class scotter extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Running");
        }
    }
}
class scotter2 extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Scooter 2 is Running");
        }
    }
}
public class run {
    public static void main(String [] args){
        scotter t1 = new scotter();
        scotter2 t2 = new scotter2();
        t1.start();
        t2.start();
    }
}
