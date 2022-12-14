public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        User user = new User();
//user.name = "Marcin";
//user.password = "password";
//
//FileOutputStream fileOut = new FileOutputStream("userInfo.txt");
//ObjectOutputStream out = new ObjectOutputStream(fileOut);
//out.writeObject(user);
//out.close();
//fileOut.close();
//        System.out.println("Object info saved!");
//
//    }

    User user = null;
 FileInputStream fileIn = new FileInputStream("userInfo.txt");
ObjectInputStream in = new ObjectInputStream(fileIn);
user = (User) in.readObject();
in.close(); fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();


