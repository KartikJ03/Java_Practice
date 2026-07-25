class Car1{
    String brand;
    String Colour;
    int Speed;
    int Engine_number;

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return Colour;
    }

    public int getSpeed() {
        return Speed;
    }

    public int getEngine_number() {
        return Engine_number;
    }

    void Start(){
        System.out.println("Car is starting");
    }
    void Stop(){
        System.out.println("Car is stopping");
    }
    void Accelerate(){
        System.out.println("Car is Accelerating");
    }
    void Brake(){
        System.out.println("Car is braking");
    }
}

public class Car_Purchase {
    public static void main(String [] args){

        Car1 z = new Car1();
        z.brand = "Suzuki";
        z.Colour = "Ebony Black";
        z.Engine_number = 1234;
        z.Speed = 100;
        System.out.println(z.getBrand());
        System.out.println(z.getColour());
        System.out.println(z.getSpeed());
        System.out.println(z.getEngine_number());
        z.Start();
        z.Brake();
        z.Stop();

    }
}
