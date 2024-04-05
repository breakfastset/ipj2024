package lesson03;

public class NestedLoops {

    public static void main(String[] args) {

        for(int i = 0; i < 2; i++) {     // 2 times i = 0, 1
            System.out.print(i + ": ");  // 2 times i = 0, 1
            for(int j = 0; j < 3; j++) {  // for each i, 3 times, j = 0, 1, 2
                System.out.print(j + " ");
            }
            System.out.println();    // 2 times i = 0, 1
        }
    }
}
