class Mythreadgpt extends Thread{
    public void run(){
        System.out.println("Child thread is running");
    }
}
public class Java_Coding_Thread1 {
    public static void main(String [] args){
        Mythreadgpt t1 = new Mythreadgpt();
        t1.start();
    }
}
