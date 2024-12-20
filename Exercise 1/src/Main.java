/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        // Creating objects for each type of employee
        Manager manager = new Manager(1, "Alice", "Sales", 5, 5000);
        Developer developer = new Developer(2, "Bob", "IT", "Java");
        Intern intern = new Intern(3, "Charlie", "HR", 6);
        Contractor contractor = new Contractor(4, "David", "Marketing", 50, 160);

        // Demonstrating polymorphism by calling the same method on different employee types
        Employee[] employees = {manager, developer, intern, contractor};
        
        for (Employee employee : employees) {
            employee.work();
            employee.takeBreak();
            System.out.println(employee.name + "'s salary: $" + employee.calculateSalary());
            System.out.println();
        }
    }
}

