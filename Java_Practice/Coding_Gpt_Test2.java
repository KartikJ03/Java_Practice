class Vehicle1{
    String brand;
    int engineNumber;
    void start(){
        System.out.println("Vehicle is startng");
    }
    void stop(){
        System.out.println("The Vehicle is stoping");
    }
}
class Car2 extends Vehicle1{
    void openSunroof(){
        System.out.println("The Sunroof is opening");
    }
}
public class Coding_Gpt_Test2 {
    public static void main(String []args){
        Car2 car = new Car2();
        car.brand = "Suzuki";
        car.engineNumber = 123;
        car.start();
        car.openSunroof();
        car.stop();
    }
}
