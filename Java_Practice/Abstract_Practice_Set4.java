interface Device{
    void turnOn();
    void turnOff();
    // Default method in interface
    default void showStatus(){
        System.out.println("Device is operational");
    }
}
class laptop implements Device{
    public void turnOn(){
        System.out.println("Laptop is turned on");
    }
    public void turnOff(){
        System.out.println("Laptop is turned off");
    }
}
class smartPhone2 implements Device{
    public void turnOn(){
        System.out.println("smartPhone is turned on");
    }
    public void turnOff(){
        System.out.println("smartPhone is turned off");
    }
}
public class Abstract_Practice_Set4 {
    public static void main(String [] args){
        Device d = new laptop();
        d.turnOn();
        d.turnOff();
        d.showStatus();
        System.out.println();
        d = new smartPhone2();
        d.turnOn();
        d.turnOff();
        d.showStatus();

    }
}
