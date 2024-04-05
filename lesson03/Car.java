package lesson03;

public class Car {
    // 1. attributes / instance fields
    private String model;    // default to null
    private String colour;

    // 2. Constructor - initialise model and colour attributes
    // a default constructor will be provided if you do not
    //    and this constructor will do nothing
    // Car() { }
    public Car() {
        model = "Tesla Model X";
        colour = "Chilli Red";
    }

    // 3. methods
    // <access modifier> <return type> method name (<params>) {
    //     body
    //  }
    public String getModel() {  // Retrieve model info
        return model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String col) {
        colour = col;
    }
}
