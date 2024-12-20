/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Developer.java (Subclass of Employee)
public class Developer extends Employee {
    private int numberOfProjects;
    private double projectBonus;

    public Developer(String name, String employeeId, double baseSalary, int numberOfProjects) {
        super(name, employeeId, baseSalary);
        this.numberOfProjects = numberOfProjects;
        this.projectBonus = numberOfProjects * 1000; // Bonus is $1000 per project
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + projectBonus;
    }

    @Override
    public String getPaySlip() {
        return "Developer Pay Slip: \n" +
               "Name: " + getName() + "\n" +
               "Employee ID: " + getEmployeeId() + "\n" +
               "Base Salary: $" + getBaseSalary() + "\n" +
               "Number of Projects: " + numberOfProjects + "\n" +
               "Project Bonus: $" + projectBonus + "\n" +
               "Total Salary: $" + calculateSalary();
    }
}

