public class KlientBiznesowy extends Klient implements KlientPremium{


    public KlientBiznesowy(String name, String surname, int accountNumber) {
        super(name, surname, accountNumber);
    }


    @Override
    public void czyJestPremium() {
        if (czyPremium){
            System.out.println("Zabrało z interface");
        }
        else {
            System.out.println("Nie zabrało.");
        }
    }
}
