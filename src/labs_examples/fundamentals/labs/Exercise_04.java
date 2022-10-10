package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // int i = 1;
        // System.out.println("int i is: " + i);
        // write your code below

        byte someByte = 127;
        System.out.println("byte someByte is: " + someByte);

        char someChar = 'c';
        System.out.println("char someChar is: " + someChar);

        float someFloat = 1.234567f; // 7 decimal places; needs f at end of number
        System.out.println("float someFloat is: " + someFloat);

        double someDouble = 1.2345678910111213; // 15 decimal places
        System.out.println("double someDouble is: " + someDouble);

        short someShort = 32767;
        System.out.println("short someShort is: " + someShort);

        int someInt = 2147483647;
        System.out.println("int someInt is: " + someInt);

        long someLong = 7000000000000000000l; // needs l at end of number
        System.out.println("long someLong is: " + someLong);

        boolean someBoolean = true;
        System.out.println("boolean someBoolean is: " + someBoolean);
    }
}
