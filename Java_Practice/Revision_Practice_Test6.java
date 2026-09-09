interface payment{
    void pay(int amount);
}
class creditcard implements payment{
    public void pay(int amount){
        System.out.println("Paid ₹"+amount+" using Credit Card");
    }
}
class upi implements payment{
    public void pay(int amount){
        System.out.println("Paid ₹"+amount+" using UPI");
    }
}
class cash14 implements payment{
    public void pay(int amount){
        System.out.println("Paid ₹"+amount+" using Cash");
    }
}
public class Revision_Practice_Test6 {
    public static void main(String [] args){
        payment p = new creditcard();
        p.pay(500);

        p = new upi();
        p.pay(5000);

        p = new cash14();
        p.pay(10000);
    }
}
