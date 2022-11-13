package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        int numberSum = 0;
        int iterationCount = 0;
        int counter;

        // 1-100 for-loop
        for(counter = 1; counter <= 100; counter++){
            numberSum += counter;
            iterationCount = counter;
        }
        double numSumAverage = (double) numberSum / (double) iterationCount;
        System.out.println("Sum of the numbers from 1 - 100: " + numberSum);
        System.out.println("The average is : " + numSumAverage);

        // user input config
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a lower number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter a higher number: ");
        int secondNumber = scanner.nextInt();

        int userNumSum = 0;
        int anotherIterationCounter = 0;

        // user input for-loop
        for(int secondCounter = firstNumber; secondCounter <= secondNumber; secondCounter++){
            userNumSum += secondCounter;
            anotherIterationCounter = secondCounter;
        }
        // print results
        double userNumAverage = (double) userNumSum / (double) anotherIterationCounter;
        System.out.println("The sum of " + firstNumber + " " + secondNumber + " :" + userNumSum);
        System.out.println(userNumAverage);

    }
}
