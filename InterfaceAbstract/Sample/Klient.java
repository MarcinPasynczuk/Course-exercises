abstract public class Klient {
    private String name;
    private String surname;
    private int accountNumber;

    public Klient(String name, String surname, int accountNumber) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int addAccountNumber(int howMuch) {
        return this.accountNumber+=howMuch;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
