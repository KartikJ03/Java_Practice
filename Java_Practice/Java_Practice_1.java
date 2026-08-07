interface Bicycle{
    public void applyBreak(int decrement);
    public void speedUp(int increment);
}
class hercules implements Bicycle{
    int speed = 7;
    public void applyBreak(int decrement){
        speed -= decrement;
        System.out.println("The speed is decreased by "+ decrement);
    }
    public void speedUp(int increment){
        speed += increment;
        System.out.println("The speed is incresed by = "+increment);
    }
}
public class Java_Practice_1 {
    public static void main(String [] args){
        hercules h = new hercules();
        h.applyBreak(4);
        h.speedUp(5);
    }
}
