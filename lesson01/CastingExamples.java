package lesson01;

public class CastingExamples {

    public static void main(String[] args) {

        int age = 23;

        double preciseAge = age;  // implicit conversion
        // value in age (23) is converted from integer to a double type.

        System.out.printf("Age: %.1f\n", preciseAge); // \n is a new line
        System.out.println("-- Bye bye --");

        // Question:
        // There are 100 sweets, to shared by 13 people
        // How many sweets are given to each person?

        int sweetCount = 100;
        int numSweetsPerPax = (int)(sweetCount / 13.0);
        System.out.printf("Num sweets per pax: %d\n", numSweetsPerPax);

    }
}
