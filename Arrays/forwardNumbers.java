import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        printArray(sortIntegers(getIntegers(5)));



    }
    public static int[] getIntegers(int arraySize) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put numbers ");
        int[] myIntArray = new int[arraySize];

        for (int i=0; i<myIntArray.length; i++){
            int input = scanner.nextInt();
            myIntArray[i] = input;
        }

        return myIntArray;
    }

    public static void printArray( int[] myIntArray){
                for (int i=0; i<myIntArray.length; i++){
            System.out.println("Element " + i + " contents " + myIntArray[i]);
        }
    }
    public static int[] sortIntegers(int[] arrayToSort){



        int temp = 0;


                for (int i = 0; i <arrayToSort.length; i++) {
            for (int j = i+1; j <arrayToSort.length; j++) {
                if(arrayToSort[i] <arrayToSort[j]) {
                    temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }
            }
        }

//        System.out.print(Arrays.toString(arrayToSort));
                return arrayToSort;
    }
    }



