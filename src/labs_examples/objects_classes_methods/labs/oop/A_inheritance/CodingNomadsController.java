package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

import java.util.ArrayList;

public class CodingNomadsController {
    public static void main(String[] args) {
        // person objects
        Person scottStudentPerson = new Person(
                "Scott",
                "Ford",
                33,
                20
        );
        Person samStudentPerson = new Person(
                "Sam",
                "Brown",
                25,
                20
        );
        Person johnMentorPerson = new Person(
                "John",
                "Doe",
                35,
                10
        );
        Person adminPerson = new Person(
                "Admin",
                "Doe",
                36,
                30
        );

        // mentor object
        ArrayList<String> johnProficiencies = new ArrayList<>();
        ArrayList<Student> johnStudents = new ArrayList<>();
        johnProficiencies.add("Java Programming");
        johnProficiencies.add("Advanced Java and Spring");
        johnProficiencies.add("Python Programming");
        johnProficiencies.add("Flask");
        Mentor johnMentor = new Mentor(
                johnMentorPerson.firstName,
                johnMentorPerson.lastName,
                johnMentorPerson.age,
                johnMentorPerson.roleCode,
                johnProficiencies,
                johnStudents,
                johnStudents.size(),
                7
        );
        ArrayList<String> adminMentorProficiencies = new ArrayList<>();
        ArrayList<Student> adminMentorStudentList = new ArrayList<>();
        adminMentorProficiencies.add("Java Programming");
        adminMentorProficiencies.add("Advanced Java and Spring");
        adminMentorProficiencies.add("Python Programming");
        adminMentorProficiencies.add("DSML");
        Mentor adminMentor = new Mentor(
                adminPerson.firstName,
                adminPerson.lastName,
                adminPerson.age,
                adminPerson.roleCode,
                adminMentorProficiencies,
                adminMentorStudentList,
                adminMentorStudentList.size(),
                9
        );

        // admin object
        Admin someAdmin = new Admin(
                adminMentor.firstName,
                adminMentor.lastName,
                adminMentor.age,
                adminMentor.roleCode,
                adminMentor.proficiencies,
                adminMentor.studentList,
                adminMentorStudentList.size(),
                4
        );

        // student objects
        ArrayList<String> scottCourseTrack = new ArrayList<>();
        ArrayList<Mentor> scottMentors = new ArrayList<>();
        scottCourseTrack.add("Java Programming");
        scottCourseTrack.add("Advanced Java and Spring");
        Student scottStudent = new Student(
                scottStudentPerson.firstName,
                scottStudentPerson.lastName,
                scottStudentPerson.age,
                scottStudentPerson.roleCode,
                scottCourseTrack,
                scottMentors,
                true,
                "Java Career"
        );

        ArrayList<String> samCourseTrack = new ArrayList<>();
        samCourseTrack.add("Python Programming");
        ArrayList<Mentor> samMentors = new ArrayList<>();
        samCourseTrack.add("Python Programming");
        samCourseTrack.add("Flask");
        Student samStudent = new Student(
                samStudentPerson.firstName,
                samStudentPerson.lastName,
                samStudentPerson.age,
                samStudentPerson.roleCode,
                samCourseTrack,
                samMentors,
                false,
                "None"
        );

        // adminMentor modification for studentList
        adminMentorStudentList.add(samStudent);
        adminMentor.studentList = adminMentorStudentList;
        adminMentor.studentCount = adminMentor.studentList.size();

        // johnMentor modification for studentList
        johnMentor.studentList.add(scottStudent);
        johnMentor.studentCount = johnMentor.studentList.size();

        // scottStudent modification for mentorList
        scottMentors.add(johnMentor);
        scottStudent.mentorList = scottMentors;
        scottStudent.mentorList.add(johnMentor);
        //System.out.println(scottStudent.mentorList);

        // someAdmin modification for salary and adminPosition
        ArrayList<String> adminPostionList = new ArrayList<>();
        adminPostionList.add("Student/Mentor Liason");
        adminPostionList.add("Python Curriculum");
        someAdmin.adminPositions = adminPostionList;
        someAdmin.salary = 65000;
        someAdmin.studentCount = someAdmin.studentList.size();
        System.out.println(someAdmin);

        //System.out.println(scottStudent);
        //System.out.println("");
        //System.out.println(johnMentor);
        //System.out.println(scottStudent.mentorList);
        //System.out.println(adminMentor);
    }
}
