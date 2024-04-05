package lesson04;

public class MathUtilities {

    // Sn = a + (a + d) + (a + 2d) + ....
    // Sn = n/2 * (2a + (n-1)d)
    // 1 + 2 + 3 + 4 ... 10 = 55
    // 1st term a = 1
    // Common difference d = 2 - 1 = 1
    // number of terms = 10
    // S10 = 10/2 * (2(1) + (10-1)(1)) = 55

    public static int summation(int n, int a, int d) {
        // n = number of terms
        // a = 1st term
        // d = common difference
        int total = n/2 * (2 * a + (n - 1) * d);
        return total;
    }

    public static int areaOfRectangle(int length, int breadth) {
        return length * breadth;
    }

}
