package lesson03;

import java.util.Arrays;

public class PassingParams {

    public static void main(String[] args) {
        int x = 33;     // primitives like int, short, byte, long, float, double, boolean, char
        changeValue(x);  // pass by value
        System.out.println("after changeValue(), x = " + x);

        x = changeValueV2(x);
        System.out.println("after changeValue2(), x = " + x);

        int[] numbers = {1, 2, 3, 4, 5};  // an array is an object
        changeValueInArray(numbers);   // pass by reference
        String output = Arrays.toString(numbers);  // get a String representation of array
        System.out.println(output);

        String message = "I love Java!";  // an object, immutable
        changeString(message);
        System.out.println(message);

        System.out.println("==== Attempt to change to uppercase ====");
        System.out.println(message.toUpperCase());   // printing a copy in uppercase
        System.out.println(message);   // original is untouched
        message = message.toUpperCase();   // assign copy in uppercase to variable message
        System.out.println("After assignment: " + message);
    }

    public static void changeString(String msg) {
        msg = "I love MATLAB too!";
    }

    public static void changeValueInArray(int[] myArray) {
        myArray[0] = 999;   // change the first item in array to 999
    }

    public static int changeValueV2(int value) {
        value = value + 11;
        return value;
    }

    // <access modifier> <return type> <method name>(<params if any>) {
    //     ....
    //     return value;  // if not void
    // }
    public static void changeValue(int value) {
        value = value + 10;   // increment value by 10
        System.out.println("-- inside changeValue(), value: " + value);
    }
}
