package lesson05;

public class Department {   // Object has toString()

    private String name;
    private String location;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String toString() {
        return name + " Department at (" + location + ") ";
    }
}
