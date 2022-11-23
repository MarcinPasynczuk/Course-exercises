import java.util.logging.Level;

public class Printer {
    private int tonerLevel;
    private int pagesNumber;

    public Printer(int tonerLevel, int pagesNumber) {
        if (tonerLevel >=0 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        }
        if (pagesNumber>=0){
        this.pagesNumber = pagesNumber;
        }
    }

    public int fillUp(int ink){
        if (tonerLevel+ink<=100){
        this.tonerLevel+=ink;
            System.out.println("new tonner lvl is: " +tonerLevel);
        }
        else {
            System.out.println("Too much ink.");
        }
        return this.tonerLevel;
    }

    public void printing(int howManyPages){
              if (this.tonerLevel/3>=howManyPages && this.pagesNumber>2*howManyPages) {
                  this.tonerLevel-=howManyPages/3;
                  this.pagesNumber-=howManyPages/2;
                  System.out.println("Toner lvl " + tonerLevel + " page numbers " + pagesNumber);
              } else {
                  System.out.println("Too low toner level, or not many paper.");
              }
    }
}
