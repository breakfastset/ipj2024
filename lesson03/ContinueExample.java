package lesson03;

public class ContinueExample {
    public static void main(String[] args) {
        int[] numbers = {12, 2, 3, 4, 52, 100, 7, 1, 20, 21, 18, 88, 99};
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2) == 0) {   // if even
                evenCount++;               // add 1 to count
            }
        }
        System.out.printf("There are %d even numbers.\n", evenCount);
    }
}
