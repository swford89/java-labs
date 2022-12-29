package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import java.util.ArrayList;

public class Student extends Person{
    // instance variables
    ArrayList<String> courseTrack;
    ArrayList<Mentor> mentorList;
    boolean mentorship;
    String mentorshipOption;

    // constructor
    Student(
            String firstName,
            String lastName,
            int age,
            int roleCode,
            ArrayList<String> courseTrack,
            ArrayList<Mentor> mentorList,
            boolean mentorship,
            String mentorshipOption
    ){
        super(firstName, lastName, age, roleCode = 20);
        this.courseTrack = courseTrack;
        this.mentorList = mentorList;
        this.mentorship = mentorship;
        this.mentorshipOption = mentorshipOption;
    }

    // getter setter methods

    public ArrayList<String> getCourseTrack() {
        return courseTrack;
    }
    public void setCourseTrack(ArrayList<String> courseTrack) {
        this.courseTrack = courseTrack;
    }
    public ArrayList<Mentor> getMentorList() {
        return mentorList;
    }
    public void setMentorList(ArrayList<Mentor> mentorList) {
        this.mentorList = mentorList;
    }
    public boolean isMentorship() {
        return mentorship;
    }
    public void setMentorship(boolean mentorship) {
        this.mentorship = mentorship;
    }
    public String getMentorshipOption() {
        return mentorshipOption;
    }
    public void setMentorshipOption(String mentorshipOption) {
        this.mentorshipOption = mentorshipOption;
    }

    // toString
    @Override
    public String toString() {
        return //super.toString() +
                "\n" +
                "Student{" +
                "\nfirstName=" + firstName +
                "\nlastName=" + lastName +
                "\nage=" + age +
                "\nroleCode=" + roleCode +
                "\ncourseTrack=" + courseTrack +
                //"\nmentorList=" + mentorList.toString() +
                ", \nmentorship=" + mentorship +
                ", \nmentorshipOption='" + mentorshipOption + '\'' +
                '}';
    }
}
