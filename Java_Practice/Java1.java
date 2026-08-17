class Mythread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<400){
            System.out.println("T1 is running");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<400){
            System.out.println("T2 is also running");
            i++;
        }
    }
}


public class Java1 {
    public static void main(String [] args){
        Mythread t1 = new Mythread();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();
    }
}
