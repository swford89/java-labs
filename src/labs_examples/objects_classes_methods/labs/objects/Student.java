package labs_examples.objects_classes_methods.labs.objects;

import java.util.Arrays;

public class Student {
    // instance variables
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String[] enrolledCourses;

    // constructors
    Student() {}
    Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    Student(String firstName, String lastName, int age, String[] enrolledCourses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.enrolledCourses = enrolledCourses;
    }

    // toString

    @Override
    public String toString() {
        return "Student{" +
                "\nfirstName='" + firstName + '\'' +
                ", \nlastName='" + lastName + '\'' +
                ", \nage=" + age +
                ", \nenrolledCourses=" + Arrays.toString(enrolledCourses) +
                '}';
    }
}
