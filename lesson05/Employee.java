package lesson05;

public class Employee {

    protected int empID;
    protected String name;
    protected Department department;   // Employee has-a department

    public Employee(int empID, String name, Department department) {
        this.empID = empID;
        this.name = name;
        this.department = department;
    }

    public int getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public void sayHi() {
        System.out.println("Hi");
    }

    // Employee Jung Jung (1234) belongs to Finance Department ....
    public String toString() {
        String output = String.format("Employee %s (%d) belongs to %s", name, empID, department);
        return output;
    }
}
