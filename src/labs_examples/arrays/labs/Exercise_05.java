package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        int[] someArray = new int[10];

        // populate array
        for(int i = 0; i < someArray.length; i++){
            someArray[i] = i + 1;
        }
        // print every other element in reverse order
        for(int i = someArray.length - 1; i > -1; i--){
            if (someArray[i] % 2 == 1) {
                System.out.println(" ----> Array value: " + someArray[i]);
            }
        }

    }

}
