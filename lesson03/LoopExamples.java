package lesson03;

public class LoopExamples {

    public static void main(String[] args) {
        // print from 1 to 10

        // Unknown number of repetitions
        // prime the loop
        // while (condition is true) {
        //     statement 1
        //     statement 2 ...
        //     update condition
        // }
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            System.out.println("-----");
            count++;
        }

        // Fixed iterations
        // for(init; condition; update condition) {
        //        statement 1
        //        statement 2 ...
        // }
        for(int i = 1; i <= 10; i++) {
            System.out.println("i: " + i);
        }

        // Executes at least once: normally used for menus
        // init
        // do {
        //        statement 1
        //        statement 2 ...
        //        update condition
        // } while (condition is true);

        int num = 5;
        do {
            System.out.println("do " + num);
            num++;
        } while (num <= 10);

    }
}
