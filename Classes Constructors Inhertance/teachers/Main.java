
    public class Main extends Teacher{
        public Main(String name, String surname, int height) {
            super(name, surname, height);
        }

        public static void main(String[] args) {


            Teacher t1 = new Teacher("Marcin", "Pierwszy", 182);
            Teacher t2 = new Teacher("Marcin", "Drugi", 190);
            Teacher t3 = new Teacher("Marcin", "Trzeci", 200);
            Teacher t4 = new Teacher("Marcin", "Czwarty", 150);

            System.out.println(t1.itIsMore());

            Teacher[] teachers = new Teacher[4];
            teachers[0] = t1;
            teachers[1] = t2;
            teachers[2] = t3;
            teachers[3] = t4;

int r = 0;
            for(int i=0; i<4; i++)
            {
                if(teachers[i].itIsMore()){
                    r+=1;
                    teachers[i].getSurname();
                }

            }
            System.out.println(r);



    }

    }




