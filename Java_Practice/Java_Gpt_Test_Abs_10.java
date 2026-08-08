interface BankAccount2{
    void deposit(double amount);
    void withdraw(double amount);
    double getbalance();
}
class SavingsAccount2 implements BankAccount2{
    String accountHolder;
    double balance;
    // Constructor
    public SavingsAccount2(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public double getbalance(){
        return balance;
    }
}
class CurrentAccount implements BankAccount2{
    String accountHolder;
    double balance;
    // Constructor
    public CurrentAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public double getbalance() {
        return balance;
    }
}
public class Java_Gpt_Test_Abs_10 {
    public static void main(String [] args){
        BankAccount2 account = new SavingsAccount2("Kartik", 10000);
        account.deposit(5000);
        account.withdraw(2000);

        System.out.println(account.getbalance());
        System.out.println();

        account = new CurrentAccount("Rahul", 20000 );
        account.deposit(10000);
        account.withdraw(5000);
        System.out.println(account.getbalance());

    }
}
