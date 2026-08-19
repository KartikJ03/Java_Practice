class carThread extends Thread{
    public carThread(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<400){
            System.out.println(" I am a car thread "+this.getName());
            i++;
        }
    }
}
public class Java_Thread_Priorities {
    public static void main(String [] args){
         carThread t1 = new carThread("BMW");
         carThread t2 = new carThread("AUDI");
         carThread t3 = new carThread("Suzuki (Minimum priority)");
         carThread t4 = new carThread("Volkswagen (Most Important Thread)");
         carThread t5 = new carThread("Skoda");
         t4.setPriority(Thread.MAX_PRIORITY);
         t3.setPriority(Thread.MIN_PRIORITY);
         t1.start();
         t2.start();
         t3.start();
         t4.start();
         t5.start();
    }
}
