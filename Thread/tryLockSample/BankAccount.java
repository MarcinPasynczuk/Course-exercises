import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount extends Thread {

    private double balance;
    private String accountNumber;
    private Lock lock;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }
//    public synchronized void deposit(double amount) {
//        balance += amount;
//        System.out.println(balance);
//    }
//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//        System.out.println(balance);
//    }

    public void printAccountNumber() {
        synchronized (this) {
            System.out.println("Acc number: " + accountNumber);
        }
    }


    public double getBalance() {
        return balance;
    }


    public void deposit(double amount) {
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance += amount;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }

        } catch(InterruptedException e) {
            // do something here
        }
    }

    public void withdraw(double amount) {
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance -= amount;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not get the lock");
            }

        } catch(InterruptedException e) {
            // do something here
        }
    }

}