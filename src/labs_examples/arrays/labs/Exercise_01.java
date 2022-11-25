package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        int[] userNumbers = new int[10];
        int numSum = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < userNumbers.length; i++){
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            userNumbers[i] = num;
        }

        for(int i = 0; i < userNumbers.length; i++){
           numSum += userNumbers[i];
        }

        double numAvg = (double) numSum / (double) userNumbers.length;
        System.out.println("Sum of the numbers entered: " + numSum);
        System.out.println("Average of the numbers: " +  numAvg);

    }

}