package lesson05;

public class PartTimeEmployee extends Employee{

    // 3 attributes inherited from Employee (empID, name, department)
    protected int hoursWorked;
    protected double rate;

    public PartTimeEmployee(int empID, String name, Department department,
                            int hoursWorked, double rate) {
        super(empID, name, department);
        this.hoursWorked = hoursWorked;
        this.rate = rate;
    }

    public double calculatePay() {
        return hoursWorked * rate;
    }

    @Override
    public String toString() {
        String output = super.toString();  // get toString() from parent
        output = output + String.format(", worked %d hours at $%.2f/h", hoursWorked, rate);
        return output;
    }
}
