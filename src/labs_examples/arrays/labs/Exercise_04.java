package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        String[][] irregTwoDArray = {
                {"Jared", "Tom", "Jeremy", "Johnny"},
                {"Bird", "Cat", "Squirrel"},
                {"Toyota", "Mitsubishi", "Honda", "Kia", "Subaru", "Ford"},
                {"Coffee", "Tea"}
        };

        for(String[] array: irregTwoDArray){
            for(String item: array){
                System.out.print(" " + item + " ");
            }
            System.out.println(" ");
        }

    }

}
