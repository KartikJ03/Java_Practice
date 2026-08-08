class Machine{
    String Model;
    public Machine(String Model){
        this.Model = Model;
    }
}
interface Vehicle2{
    void start();
}
class Car3 extends Machine implements Vehicle2{
    String brand;
    public Car3(String Model,String brand){
        super(Model);
        this.brand = brand;
    }
    public void start(){
        System.out.println("Model "+Model+" of "+brand+" car is starting");
    }
}
class Bike3 extends Machine implements Vehicle2{
    String brand;
    public Bike3(String Model, String brand){
        super(Model);
        this.brand = brand;
    }
    public void start(){
        System.out.println("Model "+Model+" of "+brand+" bike is starting");
    }
}
public class Java_Gpt_Test_Abs_7 {
    public static void main(String [] args){
        Vehicle2 v = new Car3("X5","BMW");
        v.start();
        v = new Bike3("Shine 125","Honda");
        v.start();
    }
}
