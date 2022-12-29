package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import java.util.ArrayList;

public class Admin extends Mentor{
    // instance variables
    ArrayList<String> adminPositions;
    long salary;

    // constructor
    Admin(
            String firstName,
            String lastName,
            int age,
            int roleCode,
            ArrayList<String> proficiencies,
            ArrayList<Student> studentList,
            int studentCount,
            int maxStudents
    ){
        super(firstName, lastName, age, roleCode = 30, proficiencies, studentList, studentCount, maxStudents);
        this.adminPositions = adminPositions;
        this.salary = salary;
    }

    // getter setter methods
    public ArrayList<String> getAdminPositions() {
        return adminPositions;
    }
    public void setAdminPositions(ArrayList<String> adminPositions) {
        this.adminPositions = adminPositions;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }

    // toString

    @Override
    public String toString() {
        return //super.toString() +
                "\nAdmin{" +
                "\nfirstName=" + firstName +
                "\nlastName=" + lastName +
                "\nage=" + age +
                "\nroleCode=" + roleCode +
                "\nproficiencies=" + proficiencies +
                "\nstudentCount=" + studentCount +
                "\nmaxStudents=" + maxStudents +
                "\nadminPositions=" + adminPositions +
                "\nsalary=" + salary +
                '}';
    }
}
