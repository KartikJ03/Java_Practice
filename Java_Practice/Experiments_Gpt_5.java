class MyDhagga extends Thread{
    @Override
    public void run(){
        int i = 1;
        while(i<=5){
            System.out.println("Child Thread");
            i++;
        }
    }
}
public class Experiments_Gpt_5 {
    public static void main(String [] args){
        MyDhagga t1 = new MyDhagga();
        t1.start();
        for (int i = 1 ; i<=5 ; i++){
            System.out.println("Main Thread");
        }
    }
}
