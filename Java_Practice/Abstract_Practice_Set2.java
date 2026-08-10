abstract class Pen1{
    abstract void write();
    abstract void refill();
}
class fountainPen extends Pen1{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
public class Abstract_Practice_Set2 {
    public static void main(String [] args){
        fountainPen pen = new fountainPen();
        pen.changeNib();
    }
}
