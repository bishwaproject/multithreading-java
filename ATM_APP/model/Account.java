package multithreading_java.ATM_APP.model;

public class Account {
    //we have initial balance of 6000
    private int balance = 6000;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount){
        balance = balance - amount;
    }

    
}
