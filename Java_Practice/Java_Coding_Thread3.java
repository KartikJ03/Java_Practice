class Mythreadgpt4 extends Thread{
    public void run(){
        for (int i = 1 ; i < 4 ; i++){
            System.out.println("Child " + i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("Thread Interrupted");
            }
        }
    }
}
public class Java_Coding_Thread3 {
    public static void main(String [] args){
        Mythreadgpt4 t1 = new Mythreadgpt4();
        t1.start();
        for (int i = 1 ; i < 4 ; i++){
            System.out.println("Main : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main Thread Interrupted");
            }
        }
    }
}
