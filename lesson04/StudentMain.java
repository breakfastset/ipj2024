package lesson04;

public class StudentMain {

    public static void main(String[] args) {
        Student student1 = new Student();   // default constructor
        System.out.println("Number of students: " + Student.studentCount());
        Student student2 = new Student("Professor X", "XXYY123");
        System.out.println("Number of students: " + Student.studentCount());
        Student student3 = new Student("Magneto", "AABB789");
        System.out.println("Number of students: " + Student.studentCount());

        System.out.println("--Student 1---");
        // <Object name>.<instance method>
        System.out.println(student1.getDetails());


        System.out.println("--Student 2---");
        System.out.println(student2.getDetails());
        System.out.println("--Student 3---");
        System.out.println(student3.getDetails());

    }
}
