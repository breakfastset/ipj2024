package lesson05;

public class IncentivePartTimeEmployee extends PartTimeEmployee{

    private double incentive;

    public IncentivePartTimeEmployee(int empID, String name, Department department,
                            int hoursWorked, double rate, double incentive) {
        super(empID, name, department, hoursWorked, rate);
        this.incentive = incentive;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() * 1.1 + incentive;
    }

    public double getIncentive() {
        return incentive;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Incentive: $%.2f", incentive);
    }
}
