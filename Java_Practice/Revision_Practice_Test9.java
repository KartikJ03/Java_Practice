interface payment14{
    void pay(int amount);
}
class upi14 implements payment14{
    public void pay(int amount){
        System.out.println("Paid ₹"+amount+" using UPI");
    }
}
class creditCard14 implements payment14{
    public void pay(int amount){
        System.out.println("Paid ₹"+amount+" using Credit Card");
    }
}
class cash11 implements payment14{
    public void pay(int amount){
        System.out.println("Paid ₹"+amount+" using Cash");
    }
}
public class Revision_Practice_Test9 {
    public static void main(String [] args){
        payment14 p = new upi14();
        p.pay(14000);
        System.out.println();
        p = new creditCard14();
        p.pay(15000);
        System.out.println();
        p = new cash11();
        p.pay(16000);
    }
}
