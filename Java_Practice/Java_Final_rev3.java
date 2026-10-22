class MyThread_Job extends Thread{
    int i = 0;
    @Override
    public void run(){
        while(i<3){
            System.out.println("Child Thread");
            i++;
        }
    }
}
public class Java_Final_rev3 {
    public static void main(String [] args){
        MyThread_Job t1 = new MyThread_Job();
        t1.start();
        for(int i = 0 ; i<3 ; i++){
            System.out.println("Main Thread");
        }
    }
}
