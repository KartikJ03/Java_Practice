interface Movement{
    void start();
    void stop();
}
interface Engine{
    void startEngine();
    void stopEngine();
}
class Car4 implements Movement, Engine{
    String brand;
    String model;
    public Car4(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void startEngine(){
        System.out.println(brand+"'s engine is started");
    }
    public void start(){
        System.out.println(brand+" started moving");
    }
    public void stop(){
        System.out.println(brand+" is stopping");
    }
    public void stopEngine(){
        System.out.println(brand+"'s Engine turned off");
    }
}
public class SelfTest_1 {
    public static void main(String [] args){
        Car4 c = new Car4("BMW","X5");
        c.startEngine();
        c.start();
        c.stop();
        c.stopEngine();
    }
}
