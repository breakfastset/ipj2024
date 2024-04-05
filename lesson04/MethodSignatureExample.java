package lesson04;

public class MethodSignatureExample {

    public static void main(String[] args) {
        // method signature is composed of 2 parts: (does not include the return type)
        // 1) method name
        // 2) parameters
        int result = add(10, 5);
        System.out.println("result: " + result);

        System.out.println();
        double result2 = add(10.5, 6.5);
        System.out.println("result2: " + result2);

        System.out.println();
        double result3 = add(11.1, 7);
        System.out.println("result3: " + result3);
    }

    //                add(int, int)
    public static int add(int num1, int num2) {
        System.out.println("Calling add(int, int)");
        return num1 + num2;
    }

    //                add(double, double)
    public static double add(double num1, double num2) {
        System.out.println("Calling add(double, double)");
        return num1 + num2;
    }

    //                add(double, int)
    public static double add(double num1, int num2) {
        System.out.println("Calling add(double, int)");
        return num1 + num2;
    }

    //                add(int, double)
    public static double add(int num1, double num2) {
        System.out.println("Calling add(int, double)");
        return num1 + num2;
    }

    //                add2(double, double)
    public static double add2(double num1, double num2) {
        return num1 + num2;
    }

    //               add(double, double)
//    public static int add(double n1, double n2) {
//        return (int)(n1 + n2);
//    }

}
