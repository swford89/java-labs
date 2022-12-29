package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer:
 * The datatype declaration of the variable 'a' makes it an 'A' class object,
 * which utilizes the 'A' class instance variable value of 'i'.
 * Change the datatype to 'B' and you get the 'B' class instance variable value.
 *
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}