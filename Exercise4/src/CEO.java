/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// CEO.java
import java.util.List;

class CEO extends Manager {
    private String responsibilities;

    public CEO(String name, String email, int age, String employeeId, double salary, String department, String responsibilities) {
        super(name, email, age, employeeId, salary, department);
        this.responsibilities = responsibilities;
    }

    @Override
    public void addSubordinate(Employee employee) {
        // Only Managers can be subordinates to the CEO
        if (employee instanceof Manager) {
            subordinates.add(employee);
        } else {
            System.out.println("CEO can only have Managers as subordinates.");
        }
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Responsibilities: " + responsibilities);
        System.out.println("Managing " + subordinates.size() + " Managers.");
    }

    public void compileEmployeeList() {
        System.out.println("List of Employees under CEO:");
        for (Employee employee : subordinates) {
            System.out.println("Employee Name: " + employee.getName());
            if (employee instanceof Manager) {
                System.out.println("Managing " + ((Manager) employee).getSubordinates().size() + " subordinates.");
            }
        }
    }
}

