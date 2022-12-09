import java.util.*;

public class Main {
   
    public static void main(String[] args) {

        int[] list = new int[10];
        for (int i = 0; i < list.length; i++){
            list[i] = (int) (Math.random() * 100);
}




        System.out.println(Arrays.toString(list));
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.length; i++){
            list2.add(list[i]);
        }
        Collections.sort(list2);
        Collections.reverse(list2);
        System.out.println(list2);




    }



    }
