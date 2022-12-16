class BankAccount extends Thread{

    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
//    public synchronized void deposit(double amount) {
//        balance += amount;
//        System.out.println(balance);
//    }
//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//        System.out.println(balance);
//    }


    public void deposit(double amount) {
        synchronized (this){
        balance += amount;
        System.out.println(balance);}
    }
    public void withdraw(double amount) {
        synchronized (this){
            balance -= amount;
            System.out.println(balance);}
    }

}