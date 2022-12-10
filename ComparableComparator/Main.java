import java.util.*;

public class Main {

    public static void main(String[] args) {

List<Person> list = new ArrayList<>();

        list.add(new Person("Marcin"  , "Adamski", 66));
        list.add(new Person("Marcin" , "Borys", 42));
        list.add(new Person("Paweł" , "Flet", 18));
        list.add(new Person("Ania" , "Natel", 6));
        list.add(new Person("Tomasz" , "Aron", 8));
        list.add(new Person("Zbigniew" , "Bumcud", 61));

//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println(list);

//        Collections.sort(list, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return  Integer.compare(o1.getAge(), o2.getAge());
//            }
//        });
//        System.out.println(list);




//        Collections.sort(list, new PersonAgeComparator().reversed());
//        System.out.println(list);

        Collections.sort(list, Comparator.comparingInt(Person::getAge));
        System.out.println(list);



    }



    }
