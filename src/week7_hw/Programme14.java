package week7_hw;
/*Write a class with the name Person. The class needs three fields (instance variables) with the names
  firstName, lastName of type String and age of type int.
 */

public class Programme14 {
    public class Person14 {
        String firstName;
        String lastName;
        int age;
        public void main(String[] args) {
            Person14 person = new Person14();
            person.setFirstName(""); // firstName is set to empty string
            person.setLastname(""); // lastName is set to empty string
            person.setAge(10);
            System.out.println("fullName= " + person.getFullName());
            System.out.println("teen= " + person.isTeen());
            person.setFirstName("John"); // firstName is set to John
            person.setAge(18);
            System.out.println("fullName= " + person.getFullName());
            System.out.println("teen= " + person.isTeen());
            person.setLastname("Smith"); // lastName is set to Smith
            System.out.println("fullName= " + person.getFullName());
        }
        //Method named getFirstName without any parameters, it needs to return the value of the firstName field
        public String getFirstName() {
            return firstName;
        }
        //Method named getLastName without any parameters, it needs to return the value of the lastName field
        public String getLastName() {
            return lastName;
        }
        //Method named getAge without any parameters, it needs to return the value of the age field.
        public int getAge() {
            return age;
        }
        //Method named setFirstName with one parameter of type String, it needs to set the value of the  firstName field
        public void setFirstName(String firstName) {
            this.firstName=firstName;
        }
        //Method named setLastName with one parameter of type String, it needs to set the value of the  lastName field
        public void setLastname( String lastname) {
            this.lastName=lastname;
        }
        //Method named setAge with one parameter of type int, it needs to set the value of the age field.
        public void setAge(int age) {
            if (age > 0 && age <= 100) {
                this.age = age;
            } else {
                this.age = 0;
            }
        }
        //Method named isTeen without any parameters, it needs to return true if the value of the age
        // field is  greater than 12 and less than 20, otherwise, return false.
        public  boolean isTeen(){
            if (age > 12 && age < 20) {
                return true;
            }
            return false;
        }
        //Method named getFullName without any parameters, it needs to return the full name of the
        public String getFullName(){
            if (firstName.isEmpty()) {
                return lastName;
            }
            if (lastName.isEmpty()) {
                return firstName;
            }
            if (firstName.isEmpty() && lastName.isEmpty()) {
                return " ";
            } else {
                return firstName + " " + lastName;

            }

        }
    }

    }



