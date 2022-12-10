import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,Integer> empIds = new HashMap<>();
        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Aerry", 43243254);

        System.out.println(empIds);
        System.out.println(empIds.get("Carl"));
        System.out.println(empIds.containsKey("Carl"));
        System.out.println(empIds.containsValue(12345));
        System.out.println(empIds.equals("123345"));

    }
}
