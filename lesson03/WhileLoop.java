package lesson03;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner object to read keyboard input

        int positiveCount = 0;

        // prime the loop
        System.out.print("Enter a +ve number (-1 to exit): ");
        int number = input.nextInt();

        while(number != -1) {  // -1 is sentinel value
            if(number >= 0) {
                positiveCount++;
            }
            System.out.print("Enter a +ve number (-1 to exit): ");
            number = input.nextInt();
        }
        System.out.printf("You have entered %d positive numbers.\n", positiveCount);
    }
}
