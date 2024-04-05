package lesson03;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a. Start Game
        // b. Load Game
        // c. Quit
        // >>
        String menuStr = "a. Start Game\nb. Load Game\nc. Quit\n>> ";
        String choice;
        do {
            // 1. Print the menu
            System.out.print(menuStr);
            choice = input.nextLine();  // Get user input (String)

            switch(choice) {
                case "a":
                    System.out.println("Game Starting...");
                    break;
                case "b":
                    System.out.println("Loading Game...");
                    break;
                case "c":
                    System.out.println("Saving and Quitting...");
                    break;
                default:  // invalid option
                    System.out.println("Options a to c only!");
            }

        } while(!choice.equals("c"));  // As long as choice is not "c"
    }
}
