import java.io.Serializable;

public class NumberPrinter <T extends Number & Serializable> {

    T number;

    public NumberPrinter(T number) {
        this.number = number;
    }

    public void print(){
        System.out.println(number);
    }

    public T getNumber(){
        return number;
    }

}
