package lesson01;

public class Variables {

    public static void main(String[] args) {

        byte a = 10;  // 8 bits long
        short b = 20; // 16 bits
        int c = 30;   // 32, bits freq used
        long d = 40;  // 64 bits

        float x = 50;    // 32 bits
        double y = 60;   // 64 bits, freq used

        boolean isHappy = true;   // freq used
        char alphabet = 'z';   // 8 bits, freq used

        int age = 23;
        double money = 45.67;
        boolean isUndergraduate = true;
        String name = "Landy";

        System.out.printf("%s is %d this year.\n", name, age);
        /*
        %s is a placeholder for a String
        %d is a placeholder for a decimal number (integer)
        %f is meant for floating point numbers
        %c is meant for characters
        %b is meant for booleans
         */

    }
}
