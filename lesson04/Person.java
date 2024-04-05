package lesson04;

public class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.middleName = "";
        this.lastName = "";
        this.age = age;
    }

    public Person(String firstName, String lastName, int age) {
        this(firstName, age);
        this.lastName = lastName;
    }

    public Person(String firstName, String middleName, String lastName, int age) {
        this(firstName, lastName, age);
        this.middleName = middleName;
    }

    public String getDetails() {
        String output = firstName + " " + middleName + " " + lastName + " (" + age + ")";
        return output;  // eg. John IV Wick (50)
    }
}
