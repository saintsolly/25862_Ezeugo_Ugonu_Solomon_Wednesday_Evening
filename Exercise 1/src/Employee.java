/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Employee.java
abstract class Employee {
    int id;
    String name;
    String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Abstract method to be overridden by subclasses
    abstract void work();

    // Method that could be common for all employees
    void takeBreak() {
        System.out.println(name + " is taking a break.");
    }

    // Abstract method for calculating salary
    abstract double calculateSalary();
}

