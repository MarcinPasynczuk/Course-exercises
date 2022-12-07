public class Main {
    public static void main(String[] args) {
        IntegerPrinter integerPrinter = new IntegerPrinter(454);
        integerPrinter.print();

        DoublePrinter doublePrinter = new DoublePrinter(23.6);
        doublePrinter.print();

Printer<Float> printer = new Printer<>(30.9f);
printer.print();
    }


}
