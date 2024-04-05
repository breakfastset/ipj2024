package lesson04;

public class Student {

    private String fullName;   // instance variable, attribute
    private String studentID;  // instance variable
    private static int count = 0;

    public Student() {   // default constructor
        fullName = "Dummy student";
        studentID = "IT9999999";
        count++;
    }

    public Student(String fName, String sid) {  // overloaded constructor
        fullName = fName;
        studentID = sid;
        count++;
    }

    public String getDetails() {  // non-static method, instance method
        String output = "Name: " + fullName + ", SID: " + studentID;
        return output;
    }
    // is particular to an object (applies to that object only)

    public static int studentCount() {
        return count;
    }
}
