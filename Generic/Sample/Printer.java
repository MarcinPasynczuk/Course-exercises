public class Printer<T> {

    T number;

    public Printer(T number) {
        this.number = number;
    }

    public void print(){
        System.out.println(number);
    }
}
