class State_bank_india {
    private double balance;

    State_bank_india(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        if (amount<0){
            System.out.println("Invalid Input");
        }else {
        balance = balance + amount;
        }
    }
    public double getBalance(){
        return balance;
    }
}
public class Experiments_Gpt_1 {
    static void main() {
        State_bank_india A1 = new State_bank_india(1000);
        A1.deposit(500);
        System.out.println(A1.getBalance());
    }
}
