/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Manager.java (Subclass of Employee)
public class Manager extends Employee {
    private int teamSize;
    private double bonus;

    public Manager(String name, String employeeId, double baseSalary, int teamSize) {
        super(name, employeeId, baseSalary);
        this.teamSize = teamSize;
        this.bonus = teamSize * 500; // Bonus is $500 per team member
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public String getPaySlip() {
        return "Manager Pay Slip: \n" +
               "Name: " + getName() + "\n" +
               "Employee ID: " + getEmployeeId() + "\n" +
               "Base Salary: $" + getBaseSalary() + "\n" +
               "Team Size: " + teamSize + "\n" +
               "Bonus: $" + bonus + "\n" +
               "Total Salary: $" + calculateSalary();
    }
}

