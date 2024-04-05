package lesson05;

public class PartTimeEmployeeTest {

    public static void main(String[] args) {
        Department department1 = new Department("Finance", "Building X, 5th floor");
        PartTimeEmployee ptEmployee = new PartTimeEmployee(8899, "Shaq", department1, 550, 21.79);
        System.out.println(ptEmployee);  // ptEmployee.toString()

        System.out.printf("Pay: $%.2f\n", ptEmployee.calculatePay());
    }
}
