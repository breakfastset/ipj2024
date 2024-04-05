package lesson03;

public class LabelledBreakExample {

    public static void main(String[] args) {
        int[][] matrix = {
                {33, 64, 31, 15},  // row 0
                //0,  1,  2,  3    col
                {122, 45, 6, 12},  // row 1
                {165, 123, 10, 20}  // row 2
        };
        int target = 122;
        boolean found = false;

        labelSearchMatrix:
        for(int row = 0; row < matrix.length; row++) {
            System.out.println("Row " + row);
            for(int col = 0; col < matrix[row].length; col++) {
                System.out.println(matrix[row][col]);
                if(matrix[row][col] == target) {
                    found = true;
                    break labelSearchMatrix;  // intent is to terminate all loops
                }
            }
            System.out.println();
        }

        if(found) {
            System.out.println("Target " + target + " is found");
        } else {
            System.out.println("Target not found");
        }
    }
}
