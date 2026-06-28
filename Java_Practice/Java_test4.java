class Vehicle{
    public void start(){
        System.out.println("Vehicle Starts");
    }
}
class Car extends Vehicle{
    public void start(){
        System.out.println("Car starts with key");
    }
}
class Bike extends Vehicle{
    public void start(){
        System.out.println("Bike starts with self-start");
    }
}
class Truck extends Vehicle{
    public void start(){
        System.out.println("Truck starts with heavy engine");
    }
}
public class Java_test4 {
    public static void main(String [] args){
        Car c = new Car();
        c.start();
        System.out.println();
        Bike b = new Bike();
        b.start();
        System.out.println();
        Truck t = new Truck();
        t.start();
        System.out.println();
        System.out.println("Now Solving For Bonus Challenge");
        Vehicle v1 = new Car();
        v1.start();
        System.out.println();
        Vehicle v2 = new Bike();
        v2.start();
        System.out.println();
        Vehicle v3 = new Truck();
        v3.start();

    }
}
