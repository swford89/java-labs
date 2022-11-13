package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1-50: ");
        int userNumber = scanner.nextInt();

        for(int counter = 50; counter >= userNumber; counter--){
            if (counter == userNumber){
                System.out.println("Found your number: " + counter);
                break;
            }
        }

    }
}
