package lesson01;

public class OperatorsExample {

    public static void main(String[] args) {

        int x = 10;
        int y = 3;

        // 1. Arithmetic Operators
        int total = x + y;
        int product = x * y;
        int quotient = x / y;
        int difference = x - y;
        int remainder = 10 % 3;

        System.out.printf("Total = %d\n", total);
        System.out.printf("Product = %d\n", product);
        System.out.printf("Quotient = %d\n", quotient);
        System.out.printf("Difference = %d\n", difference);
        System.out.printf("Remainder = %d\n", remainder);

        // 2. Relational
        int a = 10;
        int b = 5;
        int c = 10;

        System.out.printf("a == b => %b\n", a == b);
        System.out.printf("a == c => %b\n", a == c);
        System.out.printf("a >  b => %b\n", a > b);

        System.out.println();

        // 3 Logical Operators
        int age = 23;
        char gender = 'f';

        System.out.printf("a >= 21 and gender is male? %b",
                age >= 21 && gender == 'm');
    }
}
