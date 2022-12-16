public class Main {
    public static void main(String[] args) {


        final BankAccount account = new BankAccount("123", 1000.00);

Thread acc1 = new Thread(account) {
    public void run() {
        account.deposit(300.00);
        account.withdraw(50.00);
    }
};
Thread acc2 = new Thread(account){
            public void run() {
                account.deposit(203.75);
                account.withdraw(100.00);
            }
};
acc1.start();
acc2.start();
}}
