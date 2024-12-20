/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Manager.java
import java.util.ArrayList;
import java.util.List;

class Manager extends Employee {
    protected List<Employee> subordinates;

    public Manager(String name, String email, int age, String employeeId, double salary, String department) {
        super(name, email, age, employeeId, salary, department);
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subordinates: " + subordinates.size());
    }
}

