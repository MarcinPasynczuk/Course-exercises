public class Person{
        private String firstName;
        private String lastName;
        private int age;

        public String getFirstName(){
                return firstName;
        }

        public String getLastName(){
                return lastName;
        }

        public int getAge(){
                return age;
        }

        public void setFirstName(String Name){
                firstName = Name;
        }

        public void setLastName(String surname){
                lastName = surname;
        }

        public void setAge(int settingAge){
                if (settingAge<=100 && settingAge>=0){
                        age = settingAge;
                } else{
                        age = 0;
                }
        }

        public boolean isTeen(){
                if (age>12 && age<20){
                        return true;
                } else{
                        return false;
                }
        }

        public String getFullName(){
                if (firstName.isEmpty()){
                        return lastName;
                }
                if(lastName.isEmpty()){
                        return firstName;
                }
                return (firstName + " " + lastName);
        }




        }

