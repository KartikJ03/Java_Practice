class BankOfIndia {
    int accountnumber;
    String holdername;
    int balance;
    public void deposit(int amount){
        balance = amount + balance;
        System.out.println("The "+amount+" has been deposited" );

    }
    public void withdraw(int amount){
        if (amount>balance) {
            System.out.println("Insufficient Balance");
        }else {
            balance = balance-amount;
            System.out.println("remaining Balance = "+balance);
        }
    }
    public void displaydetails(){
        System.out.println("Account Number = "+accountnumber);
        System.out.println("Holder Name = "+holdername);
        System.out.println("Balance = "+balance);
    }
}
public class Revision_Practice_Test {
    public static void main(String [] args){
    BankOfIndia A1 = new BankOfIndia();
    A1.accountnumber = 1234;
    A1.holdername = "Kartik";
    A1.balance = 1000;
    A1.deposit(2000);
    A1.withdraw(1500);
    A1.displaydetails();

    }
}
