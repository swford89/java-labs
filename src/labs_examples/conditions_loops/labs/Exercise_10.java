package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {

        for (int counter = 100; counter > 0; counter--){
            if (counter % 2 == 1){
                continue;
            }
            System.out.println(counter);
        }

    }
}
