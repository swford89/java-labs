package labs_examples.objects_classes_methods.labs.methods;

import java.util.Scanner;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int product = multiply(4, 4);
        System.out.println("4x4 = " + product);
        double quotient = divide(9, 3);
        System.out.println("9/3 = " + quotient);
        tellJoke();
        long seconds = yearsToSeconds(1);
        System.out.println("The amount of seconds in 1 year: " + seconds);
        int counter = howManyMethod("Bear", "Hippo", "Panda", "Giraffe", "Lion", "Wolf");
        System.out.println("Length of animal list in howManyMethod: " + counter);
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static double divide(int a, int b){
        double quotient = (double) a / (double) b;
        return quotient;
    }


    // 3) Create a static void method that will print of joke of your choice to the console
    public static void tellJoke(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What does a baby computer call a father computer?\nEnter 'What?' to continue.");
        while(true) {
            String userPrompt = scanner.nextLine();
            System.out.println(userPrompt);
            if (userPrompt.contains("What?")){
                System.out.println("Data.");
                break;
            }
            else {
                System.out.println("Enter 'What?' to see the answer.");
            }
        };
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static long yearsToSeconds(int years){
        long seconds = years * 365 * 24 * 60 * 60;
        return seconds;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int howManyMethod(String...animals){
        int counter = 0;
        for (String animal: animals){
            counter++;
        }
        return counter;
    }





}
