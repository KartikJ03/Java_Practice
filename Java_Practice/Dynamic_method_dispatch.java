class Phone{
    public void SwitchOn(){
        System.out.println("Turing On Phone");
    }
}
class SmartPhone extends Phone{
    public void SwitchOn(){
        System.out.println("Turning On Smart Phone");
    }
}
public class Dynamic_method_dispatch {
    public static void main(String [] args) {
        Phone obj = new SmartPhone();
        obj.SwitchOn();
    }
}
