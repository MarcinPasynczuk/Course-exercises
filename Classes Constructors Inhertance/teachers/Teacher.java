public class Teacher {
private String name;
private String surname;
private int height;
private boolean bool;



    public Teacher(String name, String surname, int height) {
        this.name = name;
        this.surname = surname;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        System.out.println(surname);
        return surname;
    }

    public int getHeight() {
        return height;
    }

    public void printAll(){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(height);
    }

    public boolean itIsMore(){

        if(getHeight()>186) {
//            System.out.println("Yes");
            return true;
        }
        else {
//            System.out.println("No.");
return false;
        }
    }




}
