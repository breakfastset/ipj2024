package lesson05;

public class ArrayExample {

    public static void main(String[] args) {
        //int[] numbers = new int[5]; // {0, 0, 0, 0, 0}
        //                              0  1  2  3  4
        int[] numbers = {7, 8, 9, 12, 13, 14, 99};

        System.out.printf("Length of array: %d\n", numbers.length);
        for(int i = 0; i < numbers.length; i++) { // i=0, 1, 2, 3, 4
            System.out.printf("%d -> %d\n", i, numbers[i]);
        }
    }
}
