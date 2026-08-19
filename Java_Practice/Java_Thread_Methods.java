class Mythr1 extends Thread{
    public void run(){
        int i =0;
        while(i<100){
            System.out.println("I am thread 1");
            i++;
        }
    }
}
class Mythr2 extends Thread{
    public void run(){
        int i =0;
        while(i<100){
            System.out.println("I am thread 2");
            i++;
        }
    }
}
public class Java_Thread_Methods {
    public static void main(String [] args){
        Mythr1 t1 = new Mythr1();
        Mythr2 t2 = new Mythr2();
        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

        t2.start();
    }
}
