package lesson05;

public class VarArgs {

    public static void main(String[] args) {

        int total = add(1, 2, 3);
        int total2 = add(5, 7, 8, 19, 25);
        System.out.println(total);
        System.out.println(total2);
    }
    // varargs -> variable arguments
    public static int add(int ...numbers) {  // numbers is an array
        int total = 0;
        for(int number: numbers) {
            total = total + number;
        }
        return total;
    }

}
