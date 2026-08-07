class BankAccount{
    String accountHolder;
    int accountNumber;
    int balance;

    public void deposit(double amount){
        balance += (int) amount;
        System.out.println("The Balance is = "+balance);
    }
    public void withdraw(double amount){
        if (amount<=balance){
            balance -= (int)amount;
            System.out.println("Amount Debited");
            System.out.println("Remaining Balance"+balance);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    public void displayAccountDetails(){
        System.out.println("Account Holder = "+accountHolder);
        System.out.println("Account Number = "+accountNumber);
        System.out.println("Current Balance = "+balance);
    }
}

public class Coding_Gpt_Test4 {
    public static void main(String [] args){
        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();
        a.accountHolder = "Kartik";
        a.accountNumber = 123;
        a.balance = 1000;
        a.deposit(1000);
        a.withdraw(500);
        a.displayAccountDetails();


    }
}

