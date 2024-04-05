package lesson05;

public class ArraySortExample {

    public static void main(String[] args) {

        int[] array = new int[]{15, 21, 80, 72, 1, 99, 200, 50};
        System.out.println("Elements of original array: ");
        printArray(array);

        sort(array); //Sort the array in ascending order

        System.out.println("Elements of array sorted in ascending order: ");
        printArray(array);
    }
    // 15 21 72 1 80
    // 15 21 1 72 80
    // 15 1 21 72 80
    // 1 15 21 72 80

    public static void sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[smallestIndex] > array[j]) {
                    smallestIndex = j;
                }
            }
            temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
