package lesson03;

public class ForLoop {

    public static void main(String[] args) {
        int[] numbers = {6, 7, 9, 3, 4, 2, 10};  // numbers.length = 7
//                       0  1  2  3  4  5  6

        for(int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d] => %d\n", i, numbers[i]);
        }
    }
}
