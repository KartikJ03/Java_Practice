class Mythreadgpt1 extends Thread{
    public void run(){
        System.out.println("Child Thread is running");
    }
}
public class Java_Coding_Thread2 {
    public static void main(String [] args){
        Mythreadgpt1 t1 = new Mythreadgpt1();
        t1.start();
        System.out.println("Main Thread is running");
    }
}
