package lesson05;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        int[][] mArray = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11, 12}
        };
        for(int row = 0; row < mArray.length; row++) {
            for(int col = 0; col < mArray[row].length; col++) {
                System.out.printf("%4d ", mArray[row][col]);
            }
            System.out.println();
        }
    }
}
