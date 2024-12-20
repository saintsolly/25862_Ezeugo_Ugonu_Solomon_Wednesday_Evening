/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Employee.java (Abstract Class)
public abstract class Employee implements Payable {
    private String name;
    private String employeeId;
    private double baseSalary;

    public Employee(String name, String employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    // Encapsulated getter methods
    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Abstract method to calculate salary (specific to Manager and Developer)
    public abstract double calculateSalary();

    // Abstract method to generate formatted pay slip (specific to Manager and Developer)
    public abstract String getPaySlip();
}

