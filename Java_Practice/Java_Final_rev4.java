class Bank_Khata{
    private int balance;
    Bank_Khata(int balance){
        this.balance = balance;
    }
    void deposit(int amount){
        if (amount<=0){
            System.out.println("Invalid Input");
        }else {
        balance = balance + amount;
        }
    }
    void withdraw(int amount){
        if (amount>balance){
            System.out.println("Insufficient Balance");
        }else {
            balance = balance - amount;
        }

    }
    void getBalance(){
        System.out.println("Balance = "+balance);
    }
}
public class Java_Final_rev4 {
    public static void main(String [] args){
        Bank_Khata A = new Bank_Khata(5000);
        A.deposit(1000);
        A.withdraw(2000);
        A.getBalance();
    }
}
