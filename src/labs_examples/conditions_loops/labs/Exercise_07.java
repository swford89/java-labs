package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String userWord = scanner.nextLine();
        String vowels = "aeiou";
        int indexValue = 0;
        int userWordLength = userWord.length();
        int lastLetterIndex = userWord.length() -1;

        while(indexValue <= lastLetterIndex){
            char currentLetter = userWord.charAt(indexValue);

            if(vowels.indexOf(currentLetter) != -1){
                System.out.println("First vowel found in the word " + userWord + ": " + currentLetter);
                break;
            }

            indexValue++;
        }



    }
}
