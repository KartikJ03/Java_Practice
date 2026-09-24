class counter implements Runnable{
    public void run(){
        for (int i = 1 ; i <= 5 ; i++){
            System.out.println("Thread is running : "+i);
        }
    }
}
public class Java_Coding_Thread5 {
    public static void main(String [] args){
        counter obj = new counter();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.start();
        t2.start();
    }
}
