/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Contractor.java
class Contractor extends Employee {
    double hourlyRate;
    int hoursWorked;

    public Contractor(int id, String name, String department, double hourlyRate, int hoursWorked) {
        super(id, name, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void work() {
        System.out.println(name + " is working as a contractor.");
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

