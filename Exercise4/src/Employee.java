/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Employee.java
class Employee extends Person {
    protected String employeeId;
    protected double salary;
    protected String department;

    public Employee(String name, String email, int age, String employeeId, double salary, String department) {
        super(name, email, age);
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}
