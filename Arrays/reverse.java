import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int[] intArray = {1,2,3,8,9};

        reverse(intArray);



    }

private static void reverse(int[] arrayInput) {
    int[] arrayOpposite = Arrays.copyOf(arrayInput, arrayInput.length);
    for(int i = 0; i < arrayOpposite.length/2; i++){
        int temp = arrayOpposite[i];
        arrayOpposite[i] = arrayOpposite[arrayInput.length-1-i];
        arrayOpposite[arrayInput.length-1-i] = temp;
    }


    System.out.println("Array = " + Arrays.toString(arrayInput));
    System.out.println("Reversed array = "+Arrays.toString(arrayOpposite));
    }
    }
