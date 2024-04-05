package lesson05;

public class PolymorphTest {

    public static void main(String[] args) {
        Department department1 = new Department("Finance", "Building X, 5th floor");

        Department department2 = new Department("Sales", "Building Y, 13th floor");

        PartTimeEmployee ptEmployee = new PartTimeEmployee(8899, "Shaq", department1, 550, 21.79);
        PartTimeEmployee ptEmployee2 = new PartTimeEmployee(4455, "Blue", department2, 777, 41.99);
        IncentivePartTimeEmployee incentivePartTimeEmployee =
                new IncentivePartTimeEmployee(54321, "Dom", department2, 1000, 30, 25000);
        IncentivePartTimeEmployee incentivePartTimeEmployee2 =
                new IncentivePartTimeEmployee(55566, "Mary", department1, 200, 90, 45700);

        PartTimeEmployee[] employees = {ptEmployee, incentivePartTimeEmployee2, ptEmployee2, incentivePartTimeEmployee};

        // polymorphic reference is employees -> can take on different shapes
        for(int i = 0; i < employees.length; i++) {
            System.out.printf("Pay is: $%.2f\n", employees[i].calculatePay());  // polymorphism in action
        }
    }
}
