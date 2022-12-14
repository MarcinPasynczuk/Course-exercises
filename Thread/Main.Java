public class Main {
    public static void main(String[] args) {
        System.out.println("1 Hello from main.");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();
        System.out.println("3 hello again from main thread");

        new Thread() {
            public void run() {
                System.out.println("4Hello from anonymous");
            }
        }.start();

    }
}
