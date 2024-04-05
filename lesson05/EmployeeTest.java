package lesson05;

public class EmployeeTest {

    public static void main(String[] args) {
        Department department1 = new Department("Finance", "Building X, 5th floor");
        Employee employee1 = new Employee(1234, "Jung Jung", department1);

        System.out.println(employee1);
    }
}
