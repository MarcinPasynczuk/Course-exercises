package Tools;

public class Series {

    public static int nSum(int n){
        int sumNum = 0;
        if (n >=0){
        for (int i = 0; i <= n; i++){
            sumNum+=i;
        }
            System.out.println(sumNum);
        return sumNum;
    } else
    return -1;
    }

    public static int factorial(int n){
        int sumNum = 1;
        if (n >=1){
            for (int i = 1; i <= n; i++){
                sumNum*=i;
            }
            System.out.println(sumNum);
            return sumNum;
        } else
            return -1;
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
//            System.out.println(n);
            return n;
        }
//        System.out.println(fibonacci(n - 1) + fibonacci(n - 2));
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
