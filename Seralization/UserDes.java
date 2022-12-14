import java.io.Serializable;

public class UserDes implements Serializable {
    String name;
    String password;

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}
