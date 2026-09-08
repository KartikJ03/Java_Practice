class centralBank{
    private int accountNumber;
    private String holderName;
    private int balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public int getBalance() {
        return balance;
    }
    void deposit(int amount){
        balance = balance + amount;
    }
    void withdraw(int amount){
        if (amount>balance){
            System.out.println("Insufficient Balance");
        }else {
            balance = balance - amount;
        }
    }
    centralBank(int accountNumber, String holderName, int balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
}
public class Revision_Practice_Test3 {
    public static void main(String [] args){
        centralBank A = new centralBank(123456, "Kartik", 5000);
        System.out.println(A.getHolderName());
        System.out.println(A.getAccountNumber());
        System.out.println(A.getBalance());
        A.deposit(2000);
        A.withdraw(1500);

    }
}
