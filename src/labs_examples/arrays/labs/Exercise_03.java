package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int[][] twoDArray = new int[5][5];
        int multipleOfThree = 0;

        for(int i = 0; i < twoDArray.length; i++){
            for(int j = 0; j < twoDArray[i].length; j++){
                if (3 * (j + 1) % 3 == 0){
                    //System.out.println("multiple of three: " + (3 * (j + 1) + multipleOfThree));
                    twoDArray[i][j] = 3 * (j + 1) + multipleOfThree;
                }
            }
            multipleOfThree = twoDArray[i][4];
            //System.out.println(multipleOfThree);
        }

        for(int i = 0; i < twoDArray.length; i++){
            for (int j = 0; j < twoDArray[i].length; j++){
                System.out.print(" " + twoDArray[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
