package lesson04;

public class MathProblemMain {

    public static void main(String[] args) {

        // No objects were created
        // <Classname>.<static method>
        int total = MathUtilities.summation(10, 1, 1);
        System.out.println("Total: " + total);

        int area = MathUtilities.areaOfRectangle(5, 9);
        System.out.println("Area: " + area);
    }
}
