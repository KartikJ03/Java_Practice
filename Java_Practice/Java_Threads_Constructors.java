class myThr extends Thread{
    public myThr(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("I am a thread");
            i++;
        }
    }
}
public class Java_Threads_Constructors {
    public static void main(String [] args){
        myThr t1 = new myThr("kartik");
        t1.start();
        System.out.println("The id of this thread is = "+t1.getId());
        System.out.println(t1.getName());

    }
}
