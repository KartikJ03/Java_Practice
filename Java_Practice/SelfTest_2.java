interface camera{
    void takeSnap();
    void recordVideo();
    default void function(){
        System.out.println("camera is working");
    }
}
interface Wifi{
    String [] getNetworks();
    void connectToNetwork();
}
class MyCellPhone{
    void CallNumber(double PhoneNumber){
        System.out.println("Calling..."+PhoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class SmartPhone1 extends MyCellPhone implements Wifi, camera{
    public void takeSnap(){
        System.out.println("Clicking Pictures");
    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }
    public String [] getNetworks(){
        System.out.println("Getting list of networks");
        String [] networklist = {"Wifi1", "Wifi2", "Wifi3"};
        return networklist;
    }
    public void connectToNetwork(){
        System.out.println("Connecting");
    }
}
public class SelfTest_2 {
    public static void main(String [] args){
        SmartPhone1 Nokia = new SmartPhone1();
        Nokia.function();
        Nokia.takeSnap();
        Nokia.recordVideo();
        Nokia.CallNumber(91742389);
        Nokia.connectToNetwork();
        String[] ar = Nokia.getNetworks();
        for (String elements: ar){
            System.out.println(elements);
        }
    }
}
