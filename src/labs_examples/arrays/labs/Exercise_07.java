package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<String> someAnimals = new ArrayList<String>();

        someAnimals.add("Bear");
        someAnimals.add("Tiger");
        someAnimals.add("Goat");
        someAnimals.add("Moose");
        someAnimals.add("Cougar");
        someAnimals.add("Turtle");

        System.out.println("-----> List with the turtle:");
        for (String animal: someAnimals){
            System.out.println(animal);
        }

        for (String animal: someAnimals){
            if (animal == "Turtle"){
                int turtleIndex = someAnimals.indexOf("Turtle");
                someAnimals.remove(turtleIndex);
                break;
            }
        }

        System.out.println("-----> List without the turtle:");
        for (String animal: someAnimals){
            System.out.println(animal);
        }

        System.out.println("This list contain a Goat: " + someAnimals.contains("Goat"));

        for (String animal: someAnimals){
            if (animal == "Moose"){
                int mooseIndex = someAnimals.indexOf("Moose");
                someAnimals.set(mooseIndex, "Deer");
            }
        }

        System.out.println("-----> List with Moose replaced with a Deer");
        for (String animal: someAnimals){
            System.out.println(animal);
        }
    }

}
