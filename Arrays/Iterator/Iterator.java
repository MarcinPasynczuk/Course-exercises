import java.util.*;
import java.util.Scanner;

public class ListIteratorDemo {


    // Main driver method
    public static void main(String[] args)
    {
        // Creating a list of names
        List<String> names = new LinkedList<>();

Scanner scanner = new Scanner(System.in);
//        System.out.println("Wpisz 5x rzeczy:");
//
//        for (int i = 1; i < 6; i++) {
//            System.out.println("prętla nr " + i);
//            String name = scanner.nextLine();
//            names.add(name);
//        }
        names.add("1piesek");
        names.add("2pieeeeesek");
        names.add("3uszka");
        names.add("4oczy");
        names.add("5ogoooonek");





        ListIterator<String> namesIterator = names.listIterator();


while (true) {
    System.out.println("wcisnij 1 do przodu, albo 2 do tylu");

    int action = scanner.nextInt();
    scanner.nextLine();
    switch(action) {
        case 1:
            if (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
            break;}
            else {
                System.out.println("Koniec :(");
                break;
            }
        case 2:
            if (!namesIterator.hasPrevious()) {
                System.out.println("Jestes na początku");
                break;
            }
            else{
            System.out.println(namesIterator.previous());
            break;}

    }
}





        // Traversing elements using next() method
//        while (namesIterator.hasNext()) {
//            System.out.println(namesIterator.next());
//        }

        // for-each loop creates Internal Iterator here.
//        for (String s : names) {
//            System.out.println(s);
//        }
    }
}
