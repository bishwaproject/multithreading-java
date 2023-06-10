package multithreading_java.ATM_APP.client;

import multithreading_java.ATM_APP.Dao.AccountHolder;
import multithreading_java.ATM_APP.model.Account;

public class Client {

    public static void main(String[] args) {
        Account account = new Account();

        AccountHolder accountHolder = new AccountHolder(account);
        Thread t1 = new Thread(accountHolder);
        Thread t2 = new Thread(accountHolder);
        Thread t3 = new Thread(accountHolder);

        t1.setName("Jack");
        t2.setName("Joya");
        t3.setName("David");

        t1.start();
        t2.start();
        t3.start();
    
    }
    
}
