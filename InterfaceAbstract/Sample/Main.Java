public class Main {
    public static void main(String[] args) {
        KlientBiznesowy klient = new KlientBiznesowy("Marcin", "Ja", 12345);
        System.out.println(klient);
        klient.addAccountNumber(90);
        System.out.println(klient);
        klient.czyJestPremium();
    }
}
