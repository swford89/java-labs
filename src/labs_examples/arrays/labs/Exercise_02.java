package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scanner = new Scanner(System.in);
        int userNum = 0;

        // make sure number is not less than 1 or greater than 10
        while (userNum > 10 || userNum < 1){
            System.out.println("Enter a number between 1-10: ");
            userNum = scanner.nextInt();
        }

        // find index of userNum
        for(int index = 0; index < array.length; index++){
            if (array[index] == userNum){
                System.out.println("The number " + userNum + " is at index: " + index);
                break;
            }
        }

    }
}