package lesson03;


public class CarTest {

    public static void main(String[] args) {
        Car tesla = new Car();
        Car byd = new Car();
        //tesla.model = "Model Y";
        System.out.println("===== Object tesla ======");
        System.out.printf("Model  : %s\n", tesla.getModel());
        System.out.printf("Colour : %s\n", tesla.getColour());

        System.out.println("===== Object byd ======");
        System.out.printf("Model  : %s\n", byd.getModel());
        System.out.printf("Colour : %s\n", byd.getColour());

        System.out.println();
        tesla.setColour("Bright Yellow");
        System.out.println("--- After repainting (tesla) ---");
        System.out.printf("Model  : %s\n", tesla.getModel());
        System.out.printf("Colour : %s\n", tesla.getColour());

        System.out.println("===== Object byd ======");
        System.out.printf("Model  : %s\n", byd.getModel());
        System.out.printf("Colour : %s\n", byd.getColour());


    }
}
