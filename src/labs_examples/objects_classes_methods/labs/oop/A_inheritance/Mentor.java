package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import java.util.ArrayList;

public class Mentor extends Person{
    // instance variables
    ArrayList<String> proficiencies;
    ArrayList<Student> studentList;
    int studentCount;
    int maxStudents;

    // constructor
    Mentor(
            String firstName,
            String lastName,
            int age,
            int roleCode,
            ArrayList<String> proficiencies,
            ArrayList<Student> studentList,
            int studentCount,
            int maxStudents
    ){
        super(firstName, lastName, age, roleCode = 10);
        this.proficiencies = proficiencies;
        this.studentList = studentList;
        this.studentCount = studentList.size();
        this.maxStudents = maxStudents;
    }

    // getter setter methods
    public ArrayList<String> getProficiencies() {
        return proficiencies;
    }
    public void setProficiencies(ArrayList<String> proficiencies) {
        this.proficiencies = proficiencies;
    }
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    public int getStudentCount() {
        return studentCount;
    }
    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
    public int getMaxStudents() {
        return maxStudents;
    }
    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    // toString
    @Override
    public String toString() {
        return //super.toString() +
                "\n" +
                "Mentor{" +
                "\nfirstName=" + firstName +
                "\nlastName=" + lastName +
                "\nage=" + age +
                "\nroleCode=" + roleCode +
                "\nproficiencies=" + proficiencies +
                "\nstudentList=" + studentList.toString() +
                "\nstudentCount=" + studentCount +
                "\nmaxStudents=" + maxStudents +
                '}';
    }
}
