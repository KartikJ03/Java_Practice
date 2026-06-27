class Phone{
    public void SwitchOn(){
        System.out.println("Turing On Phone");
    }
    public void music(){
        System.out.println("Playing Music");
    }
}
class SmartPhone extends Phone{
    public void SwitchOn(){
        System.out.println("Turning On Smart Phone");
    }
    public void Camera(){
        System.out.println("Clicking Photos");
    }
}
public class Dynamic_method_dispatch {
    public static void main(String [] args) {
        Phone obj = new SmartPhone();
        obj.SwitchOn();
        obj.music();
    }
}
