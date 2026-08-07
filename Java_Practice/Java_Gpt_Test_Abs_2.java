abstract class BankAccount1{
    // Variables
    String accountHolder;
    double balance;

    //Constructor
    public BankAccount1(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    abstract void deposit1(double amount);
    abstract void withdraw(double amount);

    void displayBalance(){
        System.out.println("Account Holder = "+accountHolder);
        System.out.println("Balance = "+balance);
    }
}

class SavingsAccount extends BankAccount1{

    public SavingsAccount(String accountHolder, double balance){
        super(accountHolder, balance);
    }
    @Override
    void deposit1(double amount) {
        balance += amount;
        System.out.println("Amount Credited");
    }
    @Override
    void withdraw(double amount) {
        if (amount<=balance){
            balance -= amount;
            System.out.println("Amount Debited Succefully");
        }else {
            System.out.println("Insufficient Balance ");
        }
    }
}
public class Java_Gpt_Test_Abs_2 {
    public static void main(String [] args){
    SavingsAccount A = new SavingsAccount("Kartik",10000);
    A.deposit1(2000);
    A.withdraw(13000);
    A.displayBalance();

    }
}
