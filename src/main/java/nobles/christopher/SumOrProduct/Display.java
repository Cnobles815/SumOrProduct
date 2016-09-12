package nobles.christopher.SumOrProduct;

import java.util.Scanner;

/**
 * Created by christophernobles on 9/10/16.
 */
public class Display {

    //Prompt the user for input
    //Take user input
    //Display answer
    public int getUserInput1() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter integer.");
        return userInput.nextInt();

    }

    public int getUserInput2() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter integer.");
        return userInput.nextInt();

    }

    public String getUserInputStr() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose mode (Multiply or Add).");
        return userInput.next();

    }

    public void showResult (int output) {
        System.out.println("Your answer is: " + output);

    }



}