import java.util.Scanner;

public class Main {


    public static void main(String[] args) {




    }

 private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put number ");
        int input = scanner.nextInt();
        return input;


    }
    private static int[] readElements(int arraySize) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put numbers ");
        int[] myIntArray = new int[arraySize];

        for (int i=0; i<myIntArray.length; i++){
            int input = scanner.nextInt();
            myIntArray[i] = input;
        }

        return myIntArray;
    }

private static int findMin(int[] arrayMin) {
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i < arrayMin.length; i++){
            if (minValue > arrayMin[i]){
                minValue = arrayMin[i];
            }
        }
        System.out.println(minValue);


        return minValue;
    }
    }



