package lesson02;

public class TernaryOperator {

    public static void main(String[] args) {
        int age = 25;
        boolean isAdult = (age >= 21);
        System.out.println(isAdult);

        int number = 51;
        String message;
        if(number % 2 == 1) {
            message = "Odd";
        } else {
            message = "Even";
        }
        System.out.printf("%d is %s\n", number, message);

        message = number % 2 == 1 ? "Odd" : "Even";
        System.out.printf("%d is %s\n", number, message);

        int a = 80;
        int b = 30;

        int smallerNum = (a < b) ? a : b;
        System.out.printf("The smaller number is %d\n", smallerNum);
    }
}
