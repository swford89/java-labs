package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Person {
    // instance variables
    String firstName;
    String lastName;
    int age;
    int roleCode;

    // constructor
    Person(String firstName, String lastName, int age, int roleCode){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.roleCode = roleCode;
    }

    // getter setter methods
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getRoleCode() {
        return roleCode;
    }
    public void setRoleCode(int roleCode) {
        this.roleCode = roleCode;
    }

    // toString
    @Override
    public String toString() {
        return "Person{" +
                "\nfirstName='" + firstName + '\'' +
                ", \nlastName='" + lastName + '\'' +
                ", \nage=" + age +
                ", \nroleCode=" + roleCode +
                '}';
    }
}
