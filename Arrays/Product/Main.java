import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Dodaj 2o"));
        list.add(new Product("Dodaj 4"));
        list.add(new Product("Dodaj 5"));
        list.set(2, new Product( "Dodaj 6"));
        Product.addProduct(list, "blablabla");
        Product.addProduct(list, "xyz");
        System.out.println(list);


//        System.out.println(list);
//        System.out.println(list.size());

//        System.out.println(list);
//        list.remove(butter);
        System.out.println(list);
        String input = "Dodaj 6";
        list.remove(new Product(input));

        delete(input, list);

        System.out.println(list);


//filtr
        List<Product> filteredList= list.stream()
                .filter(p -> p.getName().endsWith("o")).toList();
        System.out.println(filteredList);


    }

    public static void delete(String textToRemove, List list){
//        for(int i = 0; i < list.toArray().length; i++){
//            if  (Objects.equals(textToRemove, list.get(i).toString() )){
//                list.remove(i);
//            }}
        list.remove(textToRemove);
        }


    }



