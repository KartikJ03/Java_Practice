class BankAccount3{
    String accountHolder;
    double balance;
    BankAccount3(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance = balance+amount;
    }
    public void withdraw(double amount){
        balance = balance-amount;
        if (balance>=amount){
            System.out.println("Money Debited");
        }else {
            System.out.println("Insufficient Balance");
        }
    }
    public void displayBalance(){
        System.out.println("The Curent Balance is = "+balance);
    }
}
public class Java_Coding_Test3 {
    public static void main(String [] args){
        BankAccount3 A = new BankAccount3("Kartik", 1000);
        System.out.println(A.balance);
        A.deposit(500);
        A.withdraw(300);
        A.displayBalance();

    }
}
