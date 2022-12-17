package labs_examples.objects_classes_methods.labs.objects;

public class ExerciseFourController {
    public static void main(String[] args) {
        // student one
        Student studentOne = new Student();
        studentOne.firstName = "Scott";
        studentOne.lastName = "Ford";

        // student two
        Student studentTwo = new Student("Bilbo", "Baggins", 100);

        // student three
        String[] gandalfCourses = {"Python", "Flask", "DSML"};
        Student studentThree = new Student("Gandalf", "Grey", 200, gandalfCourses);

        System.out.println(studentOne + "\n");
        System.out.println(studentTwo + "\n");
        System.out.println(studentThree + "\n");
    }
}
