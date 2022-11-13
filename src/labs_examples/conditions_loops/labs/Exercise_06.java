package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {

        int numSum = 0;
        int counter = 1;

        while(counter <= 100){
            numSum += counter;
            if(counter == 100){
                break;
            }
            counter++;
        }

        System.out.println("The sum is: " + numSum);
        System.out.println("Counter value: " + counter);
        double numAverage = (double) numSum/ (double) counter;
        System.out.println("The average: " + numAverage);
    }
}
