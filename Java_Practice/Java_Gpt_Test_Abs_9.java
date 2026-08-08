interface Payment1{
    void pay(double amount);
    void refund(double amount);
}
class CreditCard implements Payment1{
    String cardNumber;
    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public void pay(double amount){
        System.out.println("Paid "+amount+" using Credit Card "+cardNumber);
    }
    public void refund(double amount){
        System.out.println("Refunded "+amount+" to Credit Card "+cardNumber);
    }
}
class UPI implements Payment1{
    String upiId;
    public UPI(String upiID){
        this.upiId = upiID;
    }
    public void pay(double amount){
        System.out.println("Paid "+amount+" using UPI "+upiId);
    }
    public void refund(double amount){
        System.out.println("Refunded "+amount+" to UPI "+upiId);
    }
}
class cash implements Payment1{
    public void pay(double amount){
        System.out.println("Paid "+amount+ " in cash");
    }
    public void refund(double amount){
        System.out.println("Refunded "+amount+" in cash");
    }
}
public class Java_Gpt_Test_Abs_9 {
    public static void main(String [] args){
        Payment1 p = new CreditCard("123456789");
        p.pay(5000);
        p.refund(1000);
        System.out.println();
        p = new UPI("kartik@upi");
        p.pay(3000);
        p.refund(500);
        System.out.println();
        p = new cash();
        p.pay(1000);
        p.refund(200);
    }
}
