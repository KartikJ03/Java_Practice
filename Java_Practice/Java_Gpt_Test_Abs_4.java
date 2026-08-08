interface Payment{
    void pay(double amount);
}
class CreditCardPayment implements Payment{
    public void pay(double amount){
        System.out.println("Paid ₹"+amount+" using Credit card");
    }
}
class UPIPayment implements Payment{
    public void pay(double amount){
        System.out.println("Paid ₹"+amount+" using UPI");
    }
}
public class Java_Gpt_Test_Abs_4 {
    public static void main(String [] args){
        Payment A = new CreditCardPayment();
        A.pay(400000);

        A = new UPIPayment();
        A.pay(600000);
    }
}
