package lesson05;

public class TwoDArray {

    public static void main(String[] args) {

        int[][] seatingArrangement = new int[5][10];   // 5 rows, 10 columns

        seatingArrangement[2][4] = 99; // row=2, col=4

        for(int row = 0; row < seatingArrangement.length; row++) {
            for(int col = 0; col < seatingArrangement[row].length; col++) {
                System.out.printf("%3d ", seatingArrangement[row][col]);
            }
            System.out.println();   // a new line for each row
        }
    }
}
