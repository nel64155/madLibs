import java.util.Scanner;

/**
 * Mason Nelson
 * Software Engineering
 * 12-15-2019
 * Ouachita Baptist University
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Mad Libs!");
        System.out.println();

        String in1 = askFor("noun");
        String in2 = askFor("plural noun");
        String in3 = askFor("noun");
        String in4 = askFor("place");
        String in5 = askFor("adjective");
        String in6 = askFor("noun");

        System.out.println();
        System.out.println("Here is your Mad Lib!");
        System.out.println();

        System.out.println("Be kind to your " + in1 + " footed " + in2);
        System.out.println("For a duck may be somebody's " + in3);
        System.out.println("Be kind to your " + in2 + " in " + in4);
        System.out.println("Where the weather is always " + in5 + ".");
        System.out.println();
        System.out.println("You may think that this is the " + in6 + ",");
        System.out.println("Well it is.");
    }

    public static String askFor(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a " + prompt + ":");
        return input.nextLine();
    }
}
